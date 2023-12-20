package day_066_mrt;

public interface C087 {
}
class MarkList {
    int num;

    public static void graceMarks(MarkList obj4) {
        obj4.num += 10;
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList(); // 1   // new bir kez kullanilmis
        MarkList obj2 = obj1; // referans atamasi yapiliyor
        MarkList obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);

        System.out.println(obj1.num);
        System.out.println(obj2.num);

        // Kac tane marklist memory de created edilsmis soruyor
        // new keywordu bir kez kullanilmis ve bir kez created edilmis
        // cevap =1
    }
}