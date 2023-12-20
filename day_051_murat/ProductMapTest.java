package day_051_murat;

public class ProductMapTest {
    public static void main(String[] args) {
new Product(12,"Book1", Product.Size.LARGE,10,12.99);
new Product(10,"Book2", Product.Size.SMALL,10,13.99);
new Product(8,"Book3", Product.Size.MEDIUM,10,2.99);
new Product(19,"Book4", Product.Size.LARGE,10,32.99);
new Product(22,"Book5", Product.Size.SMALL,10,15.99);
new Product(32,"Book6", Product.Size.LARGE,10,17.99);


// 1. En pahali kitabin bilgilerini yazdiralim
        double maxPrice=0;
        Integer maxKey=-1;
        for (Integer key:Product.products.keySet()){
            double price=Product.products.get(key).getPrince();
            if (price>maxPrice){
                maxPrice=price;
                maxKey=key;
            }
        }
        System.out.println(Product.products.get(maxKey));
        System.out.println(maxPrice);



// 2. En cok sayidaki kitabin bilgilerini yazdiralim



// 3. 19 numarali id ye sahip kitabin bilgilerini yazdiralim



// 4. Size.LARGE olan kitaplari yazdiralim



// 5. Product sayisini yazdirin





    }
}
