package builder;

import java.util.LinkedList;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class Product {
    LinkedList<String> list;

    public Product() {
        list = new LinkedList<>();
    }

    public void add(String message) {
        list.addLast(message);
    }

    public void show() {
        list.forEach(System.out::println);
    }
}
