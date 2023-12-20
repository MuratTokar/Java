package day_062_mrt;

public class C033 {
    public static void main(String[] args) {
        Emplooye e =new Emplooye();
        // line n2
      /*  e.name="joe";     bu A sikki uyuyor
        e.contract=true;
        e.salary=100;*/
        System.out.println(e);
    }
}
class Emplooye{
    String name;
    boolean contract;
    double salary;
    Emplooye(){
  /*
this.name=new String ("Joe");
this.contract=new Boolean(true); C sikki da cevabi sagliyor
this.salary=new Double(100);*/
        // line n1
    }

    @Override
    public String toString() {
        return name + ":" + contract + ":" + salary;

    }
    /*
    * int[] nums ={1,2,3}
    * sout(nums) =array in referansini veririr
    * Arrays.toString(nums) = [1,2,3] burada arrayin degrlerini yazdik
    *
    *Static method icinde this cagrilamaz
    *
    * ArrayList<Integer> list=new ArrayList<>(); // array list ise boyle
    * list.add(1);
    * list.add(2);
    * list.add(3);
    * sout(List)=[1,2,3]
    *
    * obje ile ilgili bir bilgiyi bastirmak istedigimizde toString kullaniriz
    * */
}
