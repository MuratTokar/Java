package day_047_hakan;

import java.util.*;

public class ReviewCollections {
    /**
     * Collections:
     * Interface Iterable
     * Interface Collections
     *      - collection of objects
     *      - Not primitive datas (Wrapper classlar yardimi ile, primitive datalari object e autoboxing yaparak alabilir)
     *      - Heteregenous (Farkli data tipleri) kabul eder
     *      - growable in nature (expand, shrink) uzama, kisalma otomatik yapilir
     *      - ready methodlari vardir (standard bir data structure a sahiptir)
     * Arrays :
     *      - fixed in nature
     *      - collection of objects
     *      - Homogenuos(tek, int, String, Object) data tipi
     *      - ready methodlari yoktur (standard bir data structure a sahip degildir)
     *      - Primitive data alabilir
     * Interface List - Queue - Set
     * 1. Interface List
     *      -ArrayList:
     *          - dynamic Array
     *          - performance : fast in data storing, calling get()
     *          - Slow : Data manipulation, add(), remove(), set()
     *      - LinkedList:
     *          - Pointer structure
     *          - performance : fast in data manipulation, add(), remove(), set()
     *          - implements queue, bu yuzden hem list hem de queue gibi davranir
     *      - Vector :
     *          - LIFO - Last-In-First-Out yapisi
     *          - Eski list yontemlerinden biridir
     *          - Synchronized(thread-safe) process lerde kullanilir
     *          - Stack Class
     *              - add() -> push()
     *              - remove(index) -> pop()
     *
     *
     */

    public static void main(String[] args) {
        // Array Cities
        String[] citiesInBayern = new String[74];
        citiesInBayern[0] = "Munich";

        for(String city : citiesInBayern){

        }

        // ArrayList Cities
        List<String> citiesListInBayern = new ArrayList<>();
        citiesListInBayern.add("Munich");

        for(String city : citiesListInBayern){

        }

        Iterator iter = citiesListInBayern.iterator();
        while(iter.hasNext()){
            iter.next();
        }

        // LinkedList Cities
        List<String> citiesLinkedListInBayern = new LinkedList<>();
        citiesLinkedListInBayern.add("Munich");

        for(String city : citiesLinkedListInBayern){

        }

        Iterator iterLinked = citiesLinkedListInBayern.iterator();
        while(iterLinked.hasNext()){
            iterLinked.next();
        }


        System.out.println("********************************************");
        List<String> citiesArrayList = new ArrayList<>();
        citiesArrayList.add("Munich");
        citiesArrayList.add("Augsburg");
        citiesArrayList.add("Nurnberg");
        citiesArrayList.add("Ingolstadt");
        citiesArrayList.add("Munich");

        Iterator iterArrayList = citiesArrayList.iterator();
        while(iterArrayList.hasNext()){
            System.out.println(iterArrayList.next());
        }

        System.out.println("******************** SET ************************");

        Set<String> citiesSet = new HashSet<>();
        //Set<String> citiesSet = new HashSet<>(citiesArrayList);
        citiesSet.addAll(citiesArrayList);
        for(String city : citiesSet){
            System.out.println(city);
        }

        System.out.println("******************** delete element from ArrayList ************************");

        // For each vs While iterator
        List<String> citiesArrayListSingle = new ArrayList<>();
        citiesArrayListSingle.add("Munich");
        citiesArrayListSingle.add("Augsburg");
        citiesArrayListSingle.add("Nurnberg");
        citiesArrayListSingle.add("Ingolstadt");



        for(String city : citiesArrayListSingle){
            if(city.equals("Nurnberg")){
                int index = citiesArrayListSingle.indexOf(city);
                citiesArrayListSingle.remove(index);
            }
        }

        System.out.println(citiesArrayListSingle);

        citiesArrayListSingle.add("Nurnberg");
        System.out.println(citiesArrayListSingle);

        Iterator iterator = citiesArrayListSingle.iterator();

        while(iterator.hasNext()){
            String city = (String) iterator.next();
            if(city.equals("Nurnberg")){
                int index = citiesArrayListSingle.indexOf(city);
                citiesArrayListSingle.remove(index);
            }
        }
        System.out.println(citiesArrayListSingle);
    }
}
