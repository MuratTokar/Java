package day_007_murat;

public class Variable {
    public static void main(String[] args) {
      //Veriable   degeri atamak assign,veriable isim vermek declare demektir
        // yani Int yas= declare    Yas=40 assign
        // Int a,b,c=multi declare
        // Int a=5,b,c=10=multi declare and assign

        byte b;
        System.out.println("Byte Min Value : \t" +Byte.MIN_VALUE);
        System.out.println("Byte Max Value : \t" +Byte.MAX_VALUE);
         short s;
        System.out.println("Short Min Value :\t"+Short.MIN_VALUE);
        System.out.println("Short Max Value:\t"+Short.MAX_VALUE);
        // en cok kullanilan integer data dir
         int i;
        System.out.println("Integer Min Value :\t"+Integer.MIN_VALUE);
        System.out.println("Integer Max Value :\t"+Integer.MAX_VALUE);
        // long integer sayi degerine kadar  l harfi basta olur ama deger buyuk olunca degerin sonunada l koymaliyiz
        // integer olarak önce kabul eder
        long l=100000000000l;
        System.out.println("Long Min Value :\t"+Long.MIN_VALUE);
        System.out.println("Long Max Value :\t"+Long.MAX_VALUE);
        float f =0.5f;
        System.out.println("Float Min Value :\t"+Float.MIN_VALUE);
        System.out.println("Float Max Value :\t"+Float.MAX_VALUE);
        // en cok kullanilan ondalikli data type dir
        double d =0.5;
        System.out.println("Double Min Value :\t"+Double.MIN_VALUE);
        System.out.println("Double Max Value :\t"+Double.MAX_VALUE);
        char c=' ';
        System.out.println("Character Min Value :\t"+Character.MIN_VALUE);
        System.out.println("Character Max Value :\t"+Character.MAX_VALUE);
        System.out.println("char value :" + c);

        boolean bo=true;//.false;
        System.out.println("Boolean False Value :\t"+Boolean.FALSE);
        System.out.println("Boolean True Value :\t"+Boolean.TRUE);

        //string degiskenine deger atarken cift tirnak kullanilir
        String str="";
        int[] strArr={2,3,4};
        String[] StrArr={"aba","mama","12"};

    }
}
