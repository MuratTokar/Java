package day_067_mrt;

public class C118 {
    public static void main(String[] args) {
        String str1="Java";
        String str2=new String("java");

            // line n1

            if (str2.equals(str1.toLowerCase())){ // bu sik dogru cevap veririr.Yni cevap=B
            System.out.println("Equal"); // bunu basmasi icin yazilmasi gerekli kod hangisidir
        }else{
            System.out.println("Not Equal");
        }
    }
}
