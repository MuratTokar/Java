package day_067_mrt;

public class C123 {
    public static void main(String[] args) {
        App4 obj=new App4();
        obj.doStuff("7007");
    }
}
 class App4{
    String myStr="9009";
    public void doStuff(String str){
        int myNum=0;
        try {
            String myStr=str;
            myNum=Integer.parseInt(myStr);
        }catch (NumberFormatException ne){
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + " , myNum: " + myNum);
    }
}
// Cevap=C (myStr: 9009 , myNum: 7007)
