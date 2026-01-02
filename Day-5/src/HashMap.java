
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new java.util.HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(2, "Mango"); // overwrites value for key 2

        System.out.println("Map: " + map);

        System.out.println("Value for key 1: " + map.get(1));

        map.remove(3);

        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }
}


