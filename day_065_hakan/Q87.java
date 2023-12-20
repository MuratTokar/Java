package day_065_hakan;

public class Q87 {
}
class MarkList{
    int num;
    public static void graceMarks (MarkList obj4){
        obj4.num += 10;
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList(); // 1
        MarkList obj2 = obj1; // referans atamasi yapiliyor
        MarkList obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);

        System.out.println(obj1.num);
        System.out.println(obj2.num);
    }
}
