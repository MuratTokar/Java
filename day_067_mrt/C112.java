package day_067_mrt;

public class C112 {
    public static void main(String[] args) {
        App.displayMsg();
        App.displayMsg();
    }
}
  class App{
     int count;
    public static void displayMsg(){
        //count++;   // static olmayan bir variable yi static bir method da kullanamayiz.sadece static methodlar call edilebilir
       // count++; // line n1
       //System.out.println("Welcome  " + "Visit count : " + count); // line n2

        // Cveap =B line n1 ve n2 hata veririr
        // nonstatic variable ---> instance variable
        // static variable--> calss variable
        // static veya nonstatic bir methodun icerisinde ,nonstatic ,nonprivate variable --> local variable
        // static methods  sadece class variable,ve local variable kullanabilir
        // instance methods tum variable,local variable kullanir

    }

}
