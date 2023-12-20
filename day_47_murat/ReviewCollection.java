package day_47_murat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//next(); ileri dogru
//previous(); geri dogru
//hasNext(); ileride eleman var mi
// hasPrevious(); geride eleman var mi
// iterator: tekrarlayicic anlamindadir.listedeki elemanlara ulasabilmek ,degistirmek,ve silebilmek icin kullanilir
// list ve set kolleksiyonlari uzerinde butun ogeleleri tarayacak bicimde tekrarlanan eylemleri gerceklestirmek icin kullanilir

public class ReviewCollection {
    public static void main(String[] args) { // burda array kullandik ama sinirli data aliyor ve 74 tane.ama 75 olsa alamayacak
        String[] citiesInBayern=new String[74];
        citiesInBayern[0]="Munich";
        for (String city:citiesInBayern){

        }
        // Arraylist
        List<String> citiesListInBayern=new ArrayList<>();
        citiesListInBayern.add("Munich");
        for (String city:citiesListInBayern){

        }
        Iterator iter=citiesListInBayern.iterator();// liste elemanlarina ulasmak icin
        while (iter.hasNext());// ileride elemanin var mi
        iter.next();// burda elelamna ne yapacaksak yapariz ,yazdirisak falan


        // LinkendList
        List<String> citiesLinkedListInBayern=new LinkedList<>();
        citiesLinkedListInBayern.add("Munich");
        for (String city:citiesLinkedListInBayern){

        }
        Iterator iterLinked=citiesLinkedListInBayern.iterator();
        while (iterLinked.hasNext());
        iterLinked.next();



    }



}
