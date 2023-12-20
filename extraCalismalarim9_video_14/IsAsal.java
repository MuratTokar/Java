package extraCalismalarim9_video_14;

public class IsAsal {
    public static void main(String[] args) {
       boolean br= aslMi(17);
        System.out.println( br );



    }

    public static boolean aslMi(int sayi){
        int flag=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (flag==0){
            return true;
        }else {
            return false;
        }
        
    }
}
