package BaiThucHanh.Lap4.BaiThucHanh0405.set;

import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSet {
    public static void main(String[] args){
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");

        for (String str : linkedHashSet){
            System.out.println(str);
        }
    }
}
