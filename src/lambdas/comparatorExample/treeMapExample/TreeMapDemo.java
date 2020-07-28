package lambdas.comparatorExample.treeMapExample;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args)
    {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>((o1,o2)-> o1>o2?-1:o1<o2?1:0);

        treeMap.put(34, "India");
        treeMap.put(22, "Denmark");
        treeMap.put(30, "Germany");
        treeMap.put(10, "Spain");

        System.out.println(treeMap);


    }
}
