package day_040_hakan.QG.QG_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Color_2{
    private static ArrayList<ArrayList<String>> colorList = new ArrayList<>();
    static {
        colorList.add(new ArrayList<>(Arrays.asList("WHITE","255","255","255")));
        colorList.add(new ArrayList<>(Arrays.asList("LIGHT_GRAY","192", "192", "192")));
        colorList.add(new ArrayList<>(Arrays.asList("GRAY","128", "128", "128")));
        colorList.add(new ArrayList<>(Arrays.asList("DARK_GRAY","64", "64", "64")));
        colorList.add(new ArrayList<>(Arrays.asList("BLACK","0", "0", "0")));
        colorList.add(new ArrayList<>(Arrays.asList("RED","255", "0", "0")));
        colorList.add(new ArrayList<>(Arrays.asList("PINK","255", "175", "175")));
        colorList.add(new ArrayList<>(Arrays.asList("ORANGE","255", "200", "0")));
        colorList.add(new ArrayList<>(Arrays.asList("YELLOW","255", "255", "0")));
        colorList.add(new ArrayList<>(Arrays.asList("GREEN","0", "255", "0")));
        colorList.add(new ArrayList<>(Arrays.asList("MAGENTA","255", "0", "255")));
        colorList.add(new ArrayList<>(Arrays.asList("CYAN","0", "255", "255")));
        colorList.add(new ArrayList<>(Arrays.asList("BLUE","0", "0", "255")));
    }
    private String colorName;
    private String R;
    private String G;
    private String B;

    public Color_2(int R, int G, int B){
        this.R = R + "";
        this.G = G + "";
        this.B = B + "";
    }

    @Override
    public String toString() {
        for(ArrayList<String> color : colorList){
            if(color.get(1).equals(this.R)){
                if(color.get(2).equals(this.G)){
                    if(color.get(3).equals(this.B)){
                        return color.get(0);
                    }
                }
            }
        }
        return "Invalid RGB value!";
    }
}