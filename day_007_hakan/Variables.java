package day_007_hakan;

public class Variables {

    public static void main(String[] args) {

        byte b=120;
        System.out.println("Byte Min Value : \t" + Byte.MIN_VALUE);
        System.out.println("Byte Max Value : \t" + Byte.MAX_VALUE);

        short s=32000;
        System.out.println("Short Min Value : \t" + Short.MIN_VALUE);
        System.out.println("Short Max Value : \t" + Short.MAX_VALUE);

        // en cok kullanilan integer data type
        int i=1288888;
        System.out.println("Integer Min Value : \t" + Integer.MIN_VALUE);
        System.out.println("Integer Max Value : \t" + Integer.MAX_VALUE);

        long l=2147483648l;
        System.out.println("Long Min Value : \t" + Long.MIN_VALUE);
        System.out.println("Long Max Value : \t" + Long.MAX_VALUE);

        float f = 0.5f;
        System.out.println("Float Min Value \t\t: " + Float.MIN_VALUE);
        System.out.println("Float Max Value \t\t: " + Float.MAX_VALUE);

        // en cok kullanilan ondalikli data type
        double d = 0.5;
        System.out.println("Double Min Value \t\t: " + Double.MIN_VALUE);
        System.out.println("Double Max Value \t\t: " + Double.MAX_VALUE);

        char c=' ';
        System.out.println("Character Min Value \t\t: " + (int) Character.MIN_VALUE);
        System.out.println("Character Max Value \t\t: " + (int) Character.MAX_VALUE);
        System.out.println("char value : " + (int) c);

        boolean bo = true; //, false;
        System.out.println("Boolean False Value \t\t: " +  Boolean.FALSE);
        System.out.println("Boolean True Value \t\t\t: " + Boolean.TRUE);

        // String degiskenine deger atarken cift tirnak kullanilir ""
        String str= "";
        int[] intArr = {2,3,5};
        String[] strArr={"aba","mama","12"};

    }
}
