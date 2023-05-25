

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("CSLT", "co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C#");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Cac entry cos trong setHashMap: ");
        System.out.println(setHashMap);
    }
}
