package day_038_OOP.RGB;

public class Color {

    private String colorName;

    private int[] rgbValues;

    public Color(String colorName, int[] rgbValues) {
        this.colorName = colorName;
        this.rgbValues = rgbValues;
    }

    public String getColorName() {
        return colorName;
    }




    public boolean matches(int[] rgb) {


        if (rgb.length != 3) {
            return false;
        }

        for (int i = 0; i < 3; i++) {

            if (rgb[i] != rgbValues[i]) {
                return false;
            }
        }


        return true;

    }

}
