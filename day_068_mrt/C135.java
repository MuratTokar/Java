package day_068_mrt;

public class C135 {

}
class Planet {
    public String name;
    public int moons;

    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("Mercury", 0),
                new Planet("Venus", 0),
                new Planet("Earth", 1),
                new Planet("Mars", 2)};

        System.out.println(planets);          // planets array object referans numarasi
        System.out.println(planets[2].name);  // Earth
        System.out.println(planets[2].moons); // 1

        // CEVAP=B
        //[Lday_68_mrt.Planet;@7d417077
       // Earth
       // 1





        //Array ; Arrays.toString(arrName) ile yazdirilir,for ile de yazilir


        // Arraylist ; System.out.print(arrList) bu sekilde yazdirilir
    }
}