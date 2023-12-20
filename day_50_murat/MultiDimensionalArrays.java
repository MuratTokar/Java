package day_50_murat;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        /*
        * Arrays
        * -fixed-length
        * primitive  ve objeckts
        * kendi hazir data structure  metotlari yoktur
        * performans olarak daha hizli cunku sabit bir uzunluga sahip oldugu icin
        *
        * Arraylist
        * -dynamic -length
        * objeckts
        * kendi metotlari var
        * performans olarak  daha yavas (arka planda arra yapisi ,ilk olustugunda 10
        *  uzunlugunda olan bir array ,kullanildigi icin ilk 10 nensede hizli,daha sonra yavastir*/

        String[] names={"Turgut","Haldun","Enes","Alper","Said"};
        for (int i = 0; i <names.length ; i++) {
            System.out.println(i+1 + " name " + names[i]);
        }
        String[][] names2={{"Turgut","Haldun","Enes","Alper","Said"},{"T","H","E","A","S"},{"a","b","c","d","e"}};
        System.out.println(names2[0][0]);// 0. (ilk) array 0.index=ilk array,Turgut
        System.out.println(names2[0][1]);// 0. (ilk) array 1.index=ilk array,Haldun
        System.out.println(names2[0][2]);// 0. (ilk) array 2.index=ilk array,Enes
        System.out.println(names2[0][3]);// 0. (ilk) array 3.index=ilk array,Alper
        System.out.println(names2[0][4]);// 0. (ilk) array 4.index=ilk array,Said


        System.out.println(names2[1][0]);//T
        System.out.println(names2[1][1]);//H
        System.out.println(names2[1][2]);//E
        System.out.println(names2[1][3]);//A
        System.out.println(names2[1][4]);//S


        System.out.println(names2[2][0]);//
        System.out.println(names2[2][1]);//
        System.out.println(names2[2][2]);//
        System.out.println(names2[2][3]);//
        System.out.println(names2[2][4]);//
        // multidimensional array larda ,arraylar ayni uzunlukta olmak zorunda degil,fakat eksik uzunluktaki arrayin
        // elemanlari "null" degeri atanmaz

        System.out.println("multidimensional array for loop");

        for (int i = 0; i <names2.length ; i++) { // array sayisini verir.kacinci array da oldugumuzu verir
            for (int j = 0; j < names2[i].length ; j++) {// her bir arrayin eleman sayisini verir.butun arraylari dolasir
                System.out.println("names2[" + i + "][" + i + "]= " + names2[i][j]);

            }

        }







    }
}
