package day_36_murat;

public class Person {
    static String classname="Person";
    public Person(){
        // super class in default constructoru private olamaz
    }
    public Person(String name){ // parametreli constrzctor

    }

    static public void printName(){
        System.out.println(classname);

    }
    public void overrideMethod(){
        System.out.println("Person override method");

    }


}



class PersonTest{
    public static void main(String[] args) {
        Emplooye emplooye=new Emplooye();
        // static variable ve methodlara objectNmae yerine className ile erisilmesi
        // tercih edilir

       // System.out.println(emplooye.className);
        //emplooye.printName();// className ile static method eristik

        System.out.println(Emplooye.className);
        Emplooye.printName();

        System.out.println(Person.classname);
        Person.printName();

    }

}