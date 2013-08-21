/**
 * Created with IntelliJ IDEA.
 * User: Yin
 * Date: 13-8-14
 * Time: 下午9:30
 */
public class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGuess = 0; //记录玩家猜测次数的变量，并赋初值
        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();
/*
用随机数产生第一格的位置，然后以此制作出数组
*/
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationCells(locations); //赋值位置

        boolean isAlive = true; //创建出记录游戏是否继续运行的boolean变量

        while(isAlive == true) {
            String guess = helper.getUserInput("Enter a number"); //取得玩家输入的字符串
            String result = theDotCom.checkYourself(guess); //检查玩家的猜测并将结果储存在String中
            numOfGuess++;

            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            } // close if
        } // close while
    } // close main
}