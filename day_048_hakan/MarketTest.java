package day_048_hakan;

import java.util.*;

public class MarketTest {
    public static void main(String[] args) {
        Employee employee_1 = new Employee("Hakki", 15000, "Director");
        Market market = new Market("Kahraman Market", "Ankara", employee_1);
        market.addEmployee(employee_1);

        Product product_1 = new Product("book", 5, 55.5, 70);
        Product product_2 = new Product("ebook", 5, 50, 70);
        Product product_3 = new Product("abook", 5, 57, 70);
        Product product_4 = new Product("kbook", 5, 60, 70);
        Product product_5 = new Product("cbook", 5, 65, 70);
        Product product_6 = new Product("zbook", 5, 70, 70);
        Product product_7 = new Product("mbook", 5, 55.5, 70);

        market.addProductList(Arrays.asList(product_1, product_2, product_2, product_3, product_4, product_5, product_6, product_7));
        //System.out.println(market.getEmployeeList());
        //System.out.println(market.getListOfProduct());

        List<Product> productList = new ArrayList<>(Arrays.asList(product_1, product_2, product_3, product_4, product_5, product_6, product_7));


        Collections.sort(productList);
        Collections.sort(productList, Collections.reverseOrder());
        System.out.println(productList);

        Comparator<Product> compareByPurchasePrice = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPurchasePrice() > p2.getPurchasePrice()) {
                    return 1;
                } else if (p1.getPurchasePrice() < p2.getPurchasePrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Comparator<Product> compareByPurchasePrice2 = (Product p1, Product p2) -> {
            if (p1.getPurchasePrice() > p2.getPurchasePrice()) {
                return 1;
            } else if (p1.getPurchasePrice() < p2.getPurchasePrice()) {
                return -1;
            } else {
                return 0;
            }
        };

                Collections.sort(productList, compareByPurchasePrice);
        System.out.println(productList);

    }
}
