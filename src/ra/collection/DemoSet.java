package ra.collection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<Cat>();

        Cat cat1 = new Cat("Tom" ,29);
        Cat cat2 = new Cat("Mướp" ,18);
        cats.add(cat1);
        cats.add(cat2);
        //Set không chứa phần tử trùng lặp
        cats.add(cat1);

        for (Cat cat : cats) {
            System.out.println(cat.getCatName());
        }
    }
}
