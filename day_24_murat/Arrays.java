package day_24_murat;

public class Arrays {
    public static void main(String[] args) {


    /*
        Arrays:belirli bir data type(int,double,char,string,vs)lerine sahip ddegiskenlerin bir araya gellerek olusturduklari sirali( index)
        data havuzlarina denir.Arry in uzunlugunu ya da degerini bastn vermemiz gerekir
        int[] ages;
        ages={25,30,35,40,45}
        */
        int[] ages = new int[5];
        // ages=new int[]{25,30,35,40,45}; 1.Yöntem
        ages[0] = 25;
        ages[1] = 30;
        ages[2] = 35;
        ages[3] = 40;
        ages[4] = 45;
        String[] nameOfStudents = new String[]{"haldun", "zafer", "idris", "selvi", "turgut"};
        System.out.println(nameOfStudents[2]);// ikinci index tedi ismi yazdriryorum

        for (int i = 0; i < 5; i++) {
            System.out.println(nameOfStudents[i]);

            // üstteki degerleri de for ile yerlerine yazabiliriz


        }

        int[] digits = new int[10];
        for (int i = 0; i < 10; i++) { // degerleri atar
            digits[i] = i;


        }
        for (int i = 0; i < 10; i++) { // okur
            System.out.println(digits[i]);

        }
        int[] nummers=new int[10]; // deger vermeden bastirinca sonuc 0
        for (int i = 0; i < 10; i++) {
            System.out.println(nummers[i]);


        }
        String[] words=new String[4];
        for (int i = 0; i < 4; i++) {// stringe deger atmayinca null olur
            System.out.println(words[i]);

        }
    }
}