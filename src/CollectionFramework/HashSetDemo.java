package CollectionFramework;

import java.util.HashSet;

public class HashSetDemo {
    static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set.contains(20));
        set.remove(30);
        System.out.println(set.size());
        System.out.println(set);
    }
}
/**
 * No duplications are allowed
 * no order of insertion is maintained
 * uses Hashing internally
 * very fast add(),remove() and search operations
 * no indexes
 */
