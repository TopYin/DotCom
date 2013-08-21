/**
 * Created with IntelliJ IDEA.
 * User: Yin
 * Date: 13-8-17
 * Time: 下午10:01
 */
import java.util.*;
public class DotComBust {

    private GameHelper helper= new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        /*
        * 创建3个DotCom对象
        * 并指派名称并置入ArrayList
        */
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in fewest number of guesses");

        for (DotCom dotComToSet : dotComsList) {   // 对list中所有的DotCom重复
            ArrayList<String> newLocation = helper.placeDotCom(3); // 要求DotCom的位置
            dotComToSet.setLocationCells(newLocation); // 调用这个DotCom的setter方法来指派刚取得的位置
        } // close for loop
    } // close setUpGame method

    private void StartPlaying() {
        while (!dotComsList.isEmpty()) {   // 判断DotCom的list是否为空
            String userGuess = helper.getUserInput("Enter a guess");  // 取得玩家输入
            checkUserGuess(userGuess);
        } // close while
        finishGame();
    } // close StartPlaying method

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        } // close for loop
        System.out.println(result);
    } // close method

    private void finishGame() {
        System.out.println("All dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    } // close method

    public static void main(String[] args) {
        DotComBust game = new DotComBust();  // 创建游戏对象
        game.setUpGame();      // 要求游戏对象启动
        game.StartPlaying();   // 要求游戏对象启动游戏的主要循环
    } // close method

} // close class
