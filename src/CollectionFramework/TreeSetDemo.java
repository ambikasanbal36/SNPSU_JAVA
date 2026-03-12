package CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);
    }
}
/**
 * features
 * no duplications
 * automatically sort the data
 * uses red and black tree internally
 * slower than hashset
 */
