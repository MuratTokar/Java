package day_051_hakan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMapTest {

    public static void main(String[] args) {
        new Product(12, "Book1", Product.Size.LARGE,10,12.99);
        new Product(10, "Book2", Product.Size.SMALL,100,13.99);
        new Product(8, "Book3", Product.Size.MEDIUM,20,2.99);
        new Product(19, "Book4", Product.Size.LARGE,50,32.99);
        new Product(20, "Book4", Product.Size.LARGE,60,32.00);
        new Product(22, "Book5", Product.Size.SMALL,30,15.59);
        new Product(32, "Book6", Product.Size.LARGE,40,17.99);

        // Map Product.products
        // 1. En pahali kitabin bilgilerini yazdiralim
        System.out.println("****** the most expensive product **********");

        double maxPrice = 0;
        Integer maxKey = -1;
        for(Integer key : Product.products.keySet()){
            double price = Product.products.get(key).getPrice();
            if(price > maxPrice){
                maxPrice = price;
                maxKey = key;
            }
        }

        System.out.println(Product.products.get(maxKey));
        System.out.println(maxPrice);

        // 2. En cok sayidaki kitabin bilgilerini yazdiralim
        System.out.println("****** max amount products **********");

        double maxAmount = 0;
        Integer maxAmountKey = -1;
        for(Integer key : Product.products.keySet()){
            double amount = Product.products.get(key).getAmount();
            if(amount > maxAmount){
                maxAmount = amount;
                maxAmountKey = key;
            }
        }

        System.out.println(Product.products.get(maxAmountKey));
        System.out.println(maxAmount);



        // 3. 19 numarali id ye sahip kitabin bilgilerini yazdiralim
        System.out.println("****** id = 19 product **********");


        int keySearched = 19;
        System.out.println(Product.products.get(keySearched));

        String result = Product.products.containsKey(keySearched) ? Product.products.get(keySearched).toString() : keySearched + "'e sahip bir product bulunamadi";
        System.out.println(result);


        // 4. Size.LARGE olan kitaplari yazdiralim
        System.out.println("****** products with Size.LARGE **********");


        // LARGE size ina sahip olan productlarin keylerini bir arraylist e yazdirdik
        List<Integer> keysWithLargeSize = new ArrayList<>();
        for(Integer key : Product.products.keySet()){
            Product.Size size = Product.products.get(key).getSize();
            if(size == Product.Size.LARGE){
                //System.out.println(Product.products.get(key));
                keysWithLargeSize.add(key);
            }
        }

        for(Integer key : keysWithLargeSize){
            System.out.println(Product.products.get(key));
        }

        // 5. Product sayisini yazdirin
        System.out.println("****** Size of map **********");


        System.out.println(Product.products.size());

        // 6. ismi Book4 olan product(s) yazdirin
        System.out.println("****** Book4 name **********");

        String nameSearched = "Book4";

        List<Integer> keysWithNameBook4 = new ArrayList<>();
        for(Integer key : Product.products.keySet()){
            String name = Product.products.get(key).getName();
            if(name.equals(nameSearched)){
               // System.out.println(Product.products.get(key));
                keysWithNameBook4.add(key);
            }
        }

        for(Integer key : keysWithNameBook4){
            System.out.println(Product.products.get(key));
        }


    }
}
