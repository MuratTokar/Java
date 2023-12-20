package day_068_hakan;

public class Q135 {
}

class Planet{
    public String name;
    public int moons;

    public Planet(String name, int moons){
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {
        Planet[] planets = {new Planet("Mercury",0),
                new Planet("Venus",0),
                new Planet("Earth",1),
                new Planet("Mars",2)};

        System.out.println(planets); // planets array object referans numarasi
        System.out.println(planets[2].name); // Earth
        System.out.println(planets[2].moons); // 1

        // to print array
        // Arrays.toString(arrName)

        // to print ArrayList
        // System.out.print(arrList)
    }

}