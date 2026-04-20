package map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("APPLE", 10);
        map.put("Amaan", 83);
        map.put("Maaz", 90);
        System.out.println(map.size());
        System.out.println(map.get("APPLE"));
        System.out.println(map.containsKey("Amaan"));
        System.out.println(map.containsValue(10));
        System.out.println(map.remove("Maaz"));
        for (String key : map.keySet()) {
            System.out.printf("%s : %d \n", key, map.get(key));
        }
    }
}
