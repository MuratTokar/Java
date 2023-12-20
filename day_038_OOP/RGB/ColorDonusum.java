package day_038_OOP.RGB;

import java.util.ArrayList;
import java.util.List;

    public class ColorDonusum {

        private static List<Color> colorEntries = new ArrayList<>();


        static {

            colorEntries.add(new Color("WHITE", new int[]{255, 255, 255}));               //  ==>      ColorDonusum colorEntries=  new Color()
            colorEntries.add(new Color("LIGHT_GRAY", new int[]{192, 192, 192}));
            colorEntries.add(new Color("GRAY", new int[]{128, 128, 128}));
            colorEntries.add(new Color("DARK_GRAY", new int[]{64, 64, 64}));
            colorEntries.add(new Color("BLACK", new int[]{0, 0, 0}));
            colorEntries.add(new Color("RED", new int[]{255, 0, 0}));
            colorEntries.add(new Color("PINK", new int[]{255, 175, 175}));
            colorEntries.add(new Color("ORANGE", new int[]{255, 200, 0}));
            colorEntries.add(new Color("YELLOW", new int[]{255, 255, 0}));
            colorEntries.add(new Color("GREEN", new int[]{0, 255, 0}));
            colorEntries.add(new Color("MAGENTA", new int[]{255, 0, 255}));
            colorEntries.add(new Color("CYAN", new int[]{0, 255, 255}));
            colorEntries.add(new Color("BLUE", new int[]{0, 0, 255}));

        }



        public static String convertToColorName(int[] rgb) {

            for (Color each : colorEntries) {
                if (each.matches(rgb)) {
                    return each.getColorName();
                }
            }


            return "Girilen degerlerle eslesen bir renk yok";


        }




    }
