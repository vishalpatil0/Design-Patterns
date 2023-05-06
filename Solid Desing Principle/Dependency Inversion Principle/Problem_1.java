/**
 * In this example high level module ProductCatalog is depend upon low level module 
 * SQLProductRepository. Violating the principle of DIP.
 * 
 * High level module should not depend on low level module. Both should depend upon the abstraction.
 */
import java.util.Arrays;
import java.util.List;

//high level module
class ProdcutCatalog {
    public void listAllCatalog() {
        List<String> productNames = new SQLProductRepository().getAllProductnames(); 
    }
}

//low level module
class SQLProductRepository {
    public List<String> getAllProductnames() {
        return Arrays.asList("p1","p2");
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        
    }
}