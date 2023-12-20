package day_068_hakan;

public class Q162 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /*
        day_068_hakan.Student@1b28cdfa
        day_068_hakan.Student@eed1f14
        day_068_hakan.Student@7229724f
         */

        s1 = s3;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /*
        day_068_hakan.Student@7229724f
        day_068_hakan.Student@eed1f14
        day_068_hakan.Student@7229724f
         */
        s3 = s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /*
        day_068_hakan.Student@7229724f
        day_068_hakan.Student@eed1f14
        day_068_hakan.Student@eed1f14
         */
        s2=null;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /*
        day_068_hakan.Student@7229724f
        null
        day_068_hakan.Student@eed1f14
         */
    }
}

class Student{

}
// 1 2 3
// s1 = s3  -> 1 X
// s3 = s2  -> 3 s1   2 S3    2 S2
// s2 = null -> 3 s1   2 S3