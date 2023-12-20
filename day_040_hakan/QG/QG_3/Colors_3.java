package day_040_hakan.QG.QG_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Colors_3 {
    private static ArrayList<int[]> colorList = new ArrayList<>();
    private static String [] colorNames = {"WHITE","LIGHT_GRAY","GRAY","DARK_GRAY","BLACK","RED","PINK","ORANGE","YELLOW","GREEN","MAGENTA","CYAN","BLUE"};
    static {
        colorList.add(new int[]{255,255,255});
        colorList.add(new int[]{192, 192, 192});
        colorList.add(new int[]{128, 128, 128});
        colorList.add(new int[]{64, 64, 64});
        colorList.add(new int[]{0, 0, 0});
        colorList.add(new int[]{255, 0, 0});
        colorList.add(new int[]{255, 175, 175});
        colorList.add(new int[]{255, 200, 0});
        colorList.add(new int[]{255, 255, 0});
        colorList.add(new int[]{0, 255, 0});
        colorList.add(new int[]{255, 0, 255});
        colorList.add(new int[]{0, 255, 255});
        colorList.add(new int[]{0, 0,255});
    }
    private String colorName;
    private int R;
    private int G;
    private int B;

    public Colors_3(int R, int G, int B){
        this.R = R ;
        this.G = G ;
        this.B = B ;
    }

    @Override
    public String toString() {
        for(int[] color : colorList){
            if(color[0] == this.R){
                if(color[1] == this.G){
                    if(color[2] == this.B){
                        return colorNames[colorList.indexOf(color)];
                    }
                }
            }
        }
        return "Invalid RGB value!";
    }
}
