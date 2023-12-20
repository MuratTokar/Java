package day_040_hakan.QG.QG_1;

import java.util.ArrayList;

public class Color {
    private static ArrayList<Color> colors = new ArrayList<>();
    static {
        colors.add(new Color("WHITE",255,255,255));
        colors.add(new Color("LIGHT_GRAY",192, 192, 192));
        colors.add(new Color("GRAY",128, 128, 128));
        colors.add(new Color("DARK_GRAY",64, 64, 64));
        colors.add(new Color("BLACK",0, 0, 0));
        colors.add(new Color("RED",255, 0, 0));
        colors.add(new Color("PINK",255, 175, 175));
        colors.add(new Color("ORANGE",255, 200, 0));
        colors.add(new Color("YELLOW",255, 255, 0));
        colors.add(new Color("GREEN",0, 255, 0));
        colors.add(new Color("MAGENTA",255, 0, 255));
        colors.add(new Color("CYAN",0, 255, 255));
        colors.add(new Color("BLUE",0, 0, 255));
    }
    private String colorName;
    private int R;
    private int G;
    private int B;

    public Color(int R, int G, int B){
        this.R = R;
        this.G = G;
        this.B = B;
    }

    private Color(String colorName,int R, int G, int B){
        this.colorName = colorName;
        this.R = R;
        this.G = G;
        this.B = B;
    }

    @Override
    public String toString() {
        for(Color color : colors){
            if(color.R == this.R){
                if(color.G == this.G){
                    if(color.B == this.B){
                        return color.colorName;
                    }
                }
            }
        }
        return "Invalid RGB value!";
    }
}