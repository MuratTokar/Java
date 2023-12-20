package extraCalismalarim4;

public class Isempty_IsBlank {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.isEmpty());// false

        System.out.println(str.isBlank());// false

        System.out.println("******************************************");
        str=" ";
        System.out.println(str.isBlank());// True---die bos mu

        System.out.println(str.isEmpty());// false ----str bosluktan mi olusuyor yada dizi bos mu

    }
}
