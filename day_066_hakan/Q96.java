package day_066_hakan;

public class Q96 {

    public static void main(String[] args) {
        String[] array = {"a"};
        String b = "k";
        for (String a : array) {
            switch(a){
                case "a":
                    System.out.println("bulundu");
                    continue;
            }
            if (a.equals("a")) {
                // code block
                continue;
            }
            System.out.println();
            // code block
        }

        switch(b){
            case "a":
                System.out.println("bulundu");
                //continue;
        }


    }

}
// continue loop icerisinde kullanilmadiginda hata verir
