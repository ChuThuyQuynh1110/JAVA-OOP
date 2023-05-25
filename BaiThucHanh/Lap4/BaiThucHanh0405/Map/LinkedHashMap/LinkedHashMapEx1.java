

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "C++");
        linkedHashMap.put(3, "PHP");
        linkedHashMap.put(4, "Python");

        System.out.println("Before remove: ");
        show(linkedHashMap);

        linkedHashMap.remove(2);

        System.out.println("After remove: ");
        show(linkedHashMap);

        // Print using keySet
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }

    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
