package exercise2;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<String, Product>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String name) {
        Product p = showcase.get(name);
        return p.createCopy();
    }
}
