package Behavioral.Iterator;

import java.util.List;

public class NamesIterator implements Iterator{

    int index;
    List<String> str;
    
    NamesIterator(List<String> str) {
        this.str = str;
        index = 0;
    }
    @Override
    public boolean hasNext() {
        if(index<str.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return str.get(index++);
    } 
    
}
