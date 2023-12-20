package day_047_hakan;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollections {
    public static void main(String[] args) {
        Queue<String> cities = new PriorityQueue<>();
        cities.add("Munich");
        cities.add("Augsburg");
        cities.add("Nurnberg");
        cities.add("Ingolstadt");

        System.out.println(cities.element()); // head
        System.out.println(cities.peek()); // head
        System.out.println(cities.poll());
        System.out.println(cities);


    }
}
