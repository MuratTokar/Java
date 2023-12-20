package day_046_hakan;

import java.util.*;

public class Collections_1 {
    /**
     * a[0] = 1;
     * arrList.add(1);              *A*-*B*
     * arrList.add(2);
     *
     * Iterable Interface
     * Collection Interface
     * List - Queue - Set (Interface)
     * List Interface :
     *      - ArrayList : dynamic Array
     *          - slow in data manipulation, add, remove, set
     *          - fast in data store, call data get()
     *          - methods : add(object), get(indexNumber), indexOf(object), set(indexNumber, object)
     *              remove(object), addAll(List), removeAll(List), clear(), contains(object), containsAll(List)
     *      - LinkedList : pointer ile brbirine bagli, double, cift tarafli bag ile bagli objectlerin tutuldugu list
     *          - index, ekleme sirasina gore tutulur
     *          - fast - data manipulation, add(), remove(), set()
     *          - slow - call data get() in compare to ArrayList
     *      - Vector -> Stack
     *          - Eski tip bir data tutma yontemi
     *          - Synchronized calisir
     *              Stack : last-in-first-out
     *                  - push(add), pop(remove)
     */
    public static void main(String[] args) {
        int intArr[] = {1,2,3};
        for(int a : intArr){
            System.out.println(a);
        }

        System.out.println("********************************");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            int temp = (int)iterator.next();
            System.out.println("temp : " + temp);
           // System.out.println("next : " + iterator.next());
            if(temp % 2 == 0){
                list2.add(temp);
            }
            //System.out.println(iterator.next());
        }
        list.removeAll(list2);
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("********* stack **********");

        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("java2");
        stack.push("java3");
        stack.push("java4");
        stack.push("java5");
        stack.pop(); // java5 has been removed, LIFO, last in first out

        Iterator iteratorStack = stack.iterator();

        while(iteratorStack.hasNext()){
            System.out.println(iteratorStack.next());
        }

        System.out.println("********* linkedList **********");

        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1,5,9));
        Iterator iteratorLinkedList = linkedList.iterator();

        while(iteratorLinkedList.hasNext()){
            System.out.println(iteratorLinkedList.next());
        }

        System.out.println("********* Set **********");

        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java3");
        set.add("java3");
        set.add("java");
        set.add("java5");

        Iterator iteratorSet = set.iterator();

        while(iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }

    }
}
