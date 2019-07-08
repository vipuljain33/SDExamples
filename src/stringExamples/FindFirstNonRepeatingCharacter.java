package stringExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

    public static Character findFirstNonRepeatingChar(String s)
    {
        Map<Character, Integer> counts  = new LinkedHashMap<>();

        for(char c : s.toLowerCase().toCharArray())
        {
            if(counts.containsKey(c))
            {
                counts.put(c, counts.get(c)+1);
            }else
            {
                counts.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: counts.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args)
    {

        System.out.println(findFirstNonRepeatingChar("GaeeksForgeeks"));
    }
}
