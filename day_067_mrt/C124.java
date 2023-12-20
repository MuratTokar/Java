package day_067_mrt;

public class C124 {
    public static void main(String[] args) {
        App5 obj=new App5();
        obj.doStuff("9009");
    }
}
class App5{
    String myStr="7007";
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
} // cevap=C (myStr: 7007 , myNum: 9009)

