package collections.overrideEqualsAndHashcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args)
    {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 10);
        System.out.println(map.get(1));

        map.put(1, map.get(1).intValue()+1);
    }
}
