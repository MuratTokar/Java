package day_038_hakan;

public interface   Person {
    void eat();
    void sleep();
    void wakeUp();
    void drink();
    void growUp();
}

abstract class Student implements Person {
    public void drink(){
        System.out.println("Su ic");
    }
    public void sleep(){
        System.out.println("Uyku saati 22.00");
    }
    public void wakeUp(){
        System.out.println("Kalkma saati 07.00");
    }
}

class Grundschuler extends Student {

    public void eat(){
        System.out.println("Döner ye!");
    }
    public void growUp(){
        System.out.println("Bol süt icmeliyim");
    }
    public void wakeUp(){
        System.out.println("Kalkma saati 08.00");
    }

    public void drink(){
        System.out.println("Süt ic");
    }
}

class UniversityStudent extends Student {
    public void sleep(){
        System.out.println("Uyku saati 23.00");
    }
    public void growUp(){
        System.out.println("Cok kitap okumalisin");
    }
    public void eat(){
        System.out.println("Shawarma ye!");
    }
}

class TestPerson {
    public static void main(String[] args) {
        UniversityStudent universityStudent = new UniversityStudent();
        Grundschuler grundschuler = new Grundschuler();

        grundschuler.growUp();
        universityStudent.growUp();
        // innerclass
        Student student = new Student() {
            @Override
            public void eat() {

            }

            @Override
            public void growUp() {

            }
        };

        // innerclass
        Person p = new Person() {
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }

            @Override
            public void wakeUp() {

            }

            @Override
            public void drink() {

            }

            @Override
            public void growUp() {

            }
        };
    }
}
