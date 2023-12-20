package day_070_mrt;

public class C186 {
    public static void main(String[] args) {
        S2 sobj = new S2();
        sobj.display(10, 100);
    }

}
class S1{
    protected void display(int x){
        System.out.print("Parent" +x);
    }
}
class S2 extends S1 {
    public void display(int x, int y){
        this.display(x); // x=10
        display(y);      // 100
        super.display(y);//100
    }
    public void display(int x){
        System.out.println("Child " +x); //10
    }
    // ;

}
// this.display(10) // Child 10
// display(100) // Child 100
// super.display(100) // Parent 100


