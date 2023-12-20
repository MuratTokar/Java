package day_33_murat;

public class StaticKeyword {


        static int countsOfCars;
        static  int wheelNumber=4; // sadece 1 defa, class call edildiginde
        static  String factoryName = "BMW Leipzig Factory";//
        int price; // her object olusturuldugunda, memory de yer tutar

        StaticKeyword(){
            //StaticKeyword.countsOfCars++;
            this.countsOfCars++;
        }

        public String getFactoryName(){
          //  day_033_hakan.StaticKeyword.getCountsOfCars(); // erisebilir, cünkü, object members static variable & methodlara class icinde erisebilir
            return factoryName;
        }

        public int getWheelNumber(){
            getFactoryName(); // erisebilir, cünkü, object members static variable & methodlara class icinde erisebilir
            return wheelNumber;
        }

        public static int getCountsOfCars(){
            // getFactoryName(); // erisilemez cünkü static degil
            //return price;  // erisilemez hatasi verir, cünkü static variable degil
            return countsOfCars;
        }

        /**
         * static keyword e sahip degiskene,
         * class icerisinde static keyword e sahip olan veya olmayan tüm methodlar ulasabilir
         *
         * FAKAT, static keyword e sahip degiskene,
         * class disindan sadece ama sadece Class.variableName seklinde ulasilabilir
         */
    }

    class StaticKeywordTest {
        public static void main(String[] args) {
         //   day_033_hakan.StaticKeyword obj_1 = new day_033_hakan.StaticKeyword();

            // class disindan objectler, class/static variables a ulasamaz
            // obj_1.countsOfCars // compile error

            // objects tarafindan, class disindan sadece getter methodlari ile, static degiskenlere ulasilabilir
            //System.out.println(obj_1.getFactoryName());
            //System.out.println(obj_1.getCountsOfCars());
          //  day_033_hakan.StaticKeyword.getCountsOfCars();


           // System.out.println(new day_033_hakan.StaticKeyword().getFactoryName());


            /**
             * static variable
             * Class Ici : Object & class members erisir        Class Disi : class ismi ile erisilebilir
             * static method
             * Class ici : Object & class members erisir        Class Disi : Object & class erisir
             *
             * instance variable:static olmayanlar
             * Class Ici : Object members(static methodlar erisemez) erisir        Class Disi : Object erisir
             * instance method
             * Class Ici : Object members(static methodlar erisemez) erisir        Class Disi : Object erisir
             */

        }

    }



