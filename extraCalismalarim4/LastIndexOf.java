package extraCalismalarim4;

public class LastIndexOf {
    public static void main(String[] args) {
        String str="Java bazen beyin yakar";

        System.out.println(str.indexOf("a"));// 1

        System.out.println(str.lastIndexOf("a"));//20
        System.out.println(str.lastIndexOf("a", 2));//3 yani 2.index ten sonra arayacak


    }
}
