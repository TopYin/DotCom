import java.util.*;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {    // 更新DotCom位置的setter方法
        locationCells = loc;
    }

    public void setName(String n) {   // 基本的setter方法
         name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput); // 判别玩家猜测值是否有出现在ArrayList中

        if (index >= 0) {                 // 如果索引值大于等于0，命中！
            locationCells.remove(index); //删除已经命中的格子

            if (locationCells.isEmpty()) {   // 用这个方法来判断是否击沉
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :(");  // 列出击沉的信息
            } else  {
                result = "hit";
            } // close if

        } // close outer if

        return result;   // 返回状态
    } // close method
} // close class
