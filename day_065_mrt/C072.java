package day_065_mrt;

public class C072 {
}
class Test{

    public static void main(String[] args) {
       Test ts=new Test();
        System.out.println(isAvaiable + " ");// isAvaiable basinca asagidan false degeri gelecek.// False basacak
        isAvaiable=ts.doStuff();// True basacak
        System.out.println(isAvaiable);

    }
    public static boolean doStuff(){
        return ! isAvaiable;// isavaiable tersi return edecek yani :True dönecek
    }
    static boolean isAvaiable=false;// sout olan bu variable dir.Boolean in default degeri zaten fals
}


// fallse true=B