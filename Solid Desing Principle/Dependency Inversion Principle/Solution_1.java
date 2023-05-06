/**
 * Solution of the problem_1.java
 * 
 * High level module should not depend on low level module.
 * Both should depend upon the abstraction.
 * 
 * Here now as per the definition high level module is not depended on low module.
 * both are now depended upon abstraction.
 */


import java.util.Arrays;
import java.util.List;



//high level module
class ProdcutCatalog {
    public void listAllCatalog() {
        List<String> productNames = new SQLProductRepository().getAllProductnames(); 
    }
}

class ProductFactory {
    public static ProductRepository createRepository() {
        return new SQLProductRepository();
    }
}

//abstraction
interface ProductRepository {
    public List<String> getAllProductnames();
}

//low level module
class SQLProductRepository implements ProductRepository {
    public List<String> getAllProductnames() {
        return Arrays.asList("p1","p2");
    }
}

public class Solution_1 {
    public static void main(String[] args) {
        
    }
}
