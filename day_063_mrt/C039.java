package day_063_mrt;

public class C039 {
    public static void main(String[] args) {
        WildAnimal wolf=new WildAnimal("Long");
        WildAnimal tigor=new WildAnimal("Feline",80,"short");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tigor.type + " " + tigor.maxSpeed + " " + tigor.bounds);

        // 1.canine 60 Long
        //2.Feline 80 short olmali

    }

}
class Animal{
    String type ="Canine";
    int maxSpeed=60;
    Animal(){}
    Animal(String type,int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;

    }
}
class WildAnimal extends Animal{
    String bounds;
    WildAnimal(String bounds){
        this.bounds=bounds;// this ile gondermesek sout tta basmayacak
        // line n1

    }
    WildAnimal(String type,int maxSpeed,String bounds){
        this.type=type;
        this.maxSpeed=maxSpeed; // this ile atadik yoksa ustte default degeri alirdi#
        this.bounds=bounds;
        //line n2
    }
    // 2.yol
    //Animal daki constructoru cagirirz
    //super(type,maxSpeed);
    // this.bounds=bounds

    // NOT=super ve this ile sadece 1 constructor cagrilir

    // cevap=A E
}
