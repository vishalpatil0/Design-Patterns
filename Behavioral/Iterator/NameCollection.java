package Behavioral.Iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class NameCollection implements Collection{

    private List<String> names;

    NameCollection(List<String> names) {
        this.names = names;
    }

    @Override
    public int size() {
       return names.size();
    }

    @Override
    public boolean isEmpty() {
        return names.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return names.contains((String) o);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return names.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return names.toArray();
    }

    @Override
    public boolean add(Object e) {
        return names.add((String) e);
    }

    @Override
    public boolean remove(Object o) {
        return names.remove(o);
    }

    @Override
    public boolean containsAll(Collection c) {
        return names.containsAll(c);
    }

    @Override
    public boolean addAll(Collection c) {
        return names.addAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return names.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return names.retainAll(c);
    }

    @Override
    public void clear() {
        names.clear();
    }
    
    public NamesIterator getIterator() {
        return new NamesIterator(names);
    }
}
