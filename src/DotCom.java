import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput); // 判别玩家猜测值是否有出现在ArrayList中

        if (index >= 0) {                 // 如果索引值大于等于0，命中！
            locationCells.remove(index); //删除已经命中的格子

            if (locationCells.isEmpty()) {
                result = "kill";
            } else  {
                result = "hit";
            } // close if

        } // close outer if

        return result;
    } // close method
} // close class
