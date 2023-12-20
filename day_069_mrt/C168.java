package day_069_mrt;

public class C168 {
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try{
            for(String n : names){
                pwd[idx] = n.substring(2,6);//omas bascak pwd[0] olacak
                                            // peter i basamayacak cunku 6.index i yok
                idx++;
            }
        } catch(Exception e){ // exception verecek ve bu catch yakalayacak
            System.out.println("Invalid Name");
        }

        for(String p : pwd){ // sonra buraya gelecek = {omas,null,null} basacak cunku kalan 2 eleman default
            System.out.println(p);
            // Cevap=C
        } // invalid Name
          // omas
          // null
          // null
}
    }