package Collection.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<String, String> mp = new HashMap<>();

        // insertion(add)
        mp.put("in", "India");
        mp.put("uk", "London");
        mp.put("us", "America");

        System.out.println(mp);

        Map<String, String> m = new HashMap<>();
        m.put("br", "Brazil");
        System.out.println("Before : " + m);
        m.putAll(mp);
        System.out.println("After : " + m);

        // deletion
        m.remove("uk");
        System.out.println(m);

        System.out.println("Size : " + m.size());

        // putIfAbsent() -> if not presnt before then only add

        m.putIfAbsent("in", "India3");
        System.out.println(m);
        m.putIfAbsent("ins", "India3");
        System.out.println(m);

        // get(k) -> returns value associated with key if not present returns NULL

        System.out.println(m.get("in"));

        // getOrDefault(k,defaultValue) -> returns value associated with key if key not
        // found returns defaultvalue

        System.out.println(m.getOrDefault("usa", "ANYVALUE"));

        System.out.println(m.containsKey("in"));

        System.out.println(m.containsValue("India"));

        System.out.println(m);

        m.replace("in", "Indonesia");
        System.out.println(m);

    }
}
