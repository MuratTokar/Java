package day_066_mrt;

public class C093 {

    public static void main(String[] args) {


        Product1 p1 = new Product1(101, "Pen");
        Product1 p2 = new Product1(101, "Pen");

        Product1 p3 = p1;
        boolean ans1= p1==p2;// Fals
        boolean ans2 = p1.name.equals(p2.name);// True
        System.out.print(ans1 + ":" + ans2);
    }

}

     class Product1 {

        int id;

        String name;

        public Product1(int id, String name) {
            this.id = id;
            this.name = name;
        }

    }


   // C. false:true



