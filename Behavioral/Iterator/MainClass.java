package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("vihsal");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        NameCollection nameCollection = new NameCollection(list);

        Iterator iterator = nameCollection.getIterator();
        for(;iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }   
}
