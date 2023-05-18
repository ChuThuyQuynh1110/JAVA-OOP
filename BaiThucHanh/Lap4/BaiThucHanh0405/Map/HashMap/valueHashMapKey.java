package demo.Map.HashMap;

import java.util.HashMap;

public class valueHashMapKey {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Thanh pho Ho Chi Minh");

        System.out.println("Danh sach cac thanh pho trong hashMap: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        
        System.out.println("QNg: " + hashMapCity.get("QNg"));

        System.out.println("NT" + hashMapCity.get("NT"));

        if (hashMapCity.containsValue("Thanh pho Ho Chi Minh")){
            System.out.println("Co Thanh pho Ho Chi Minh trong hashMapCity");
        }

    }
}
