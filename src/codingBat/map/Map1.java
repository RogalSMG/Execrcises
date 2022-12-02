package codingBat.map;

import java.util.Map;

public class Map1 {

    /**
     * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
     * Basically "b" is a bully, taking the value and replacing it with the empty string.
     */
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String getA = map.get("a");
            map.put("b", getA);
            map.put("a", "");
        }
        return map;
    }
}
