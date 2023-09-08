import java.util.HashMap;

class BookType {
     /**
     * this below properties are intrinsic, as many object will have same.
     */
    String author, type, distribution;

    BookType(String author, String type, String distribution) {
        this.author = author;
        this.type = type;
        this.distribution = distribution;
    }
}


class Book {

    /**
     * this below properties are extrinsic, as no other object will have same.
     */
    String name;
    int price;
    BookType type;

    Book(String name, int price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
}

class BookFactory {
    HashMap<String,BookType> map = new HashMap<>();

    BookType getBookType(String typeName, String author, String distribution) {
        BookType type = map.get(typeName);
        if(map.get(typeName) == null) {
            type = new BookType(author, typeName, distribution);
            map.put(typeName, type);
        }
        return type;
    }
}

public class BookDemo {
    
}
