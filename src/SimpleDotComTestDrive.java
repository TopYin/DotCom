/**
 * Created with IntelliJ IDEA.
 * User: Yin
 * Date: 13-8-13
 * Time: 下午9:30
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";

        }

        System.out.println(testResult);
    }
}
