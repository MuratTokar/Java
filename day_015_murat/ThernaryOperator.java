package day_015_murat;



public class ThernaryOperator {
    public static void main(String[] args) {
  int a=5;
 /* if (a==5){
      System.out.println("a esittir 5 'e ");
  }else {
      System.out.println("a 5'e esit degildir");
  }*/
  if (a==5){
      System.out.println("a esittir 5");
  }else {
      System.out.println("a esit degil 5 e");
      String str=a==5 ? "a esitti 5":"a esit degil 5";
      System.out.println("Str degeri: " + str);
  }
    }

}
