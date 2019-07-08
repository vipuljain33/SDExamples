package stringExamples;

public class ReverseWordsInAGivenString {

    static String s2;

    static String reverseWords(String s)
    {
        String s2="";
        int prev = s.length();

        for(int i = s.length()-1; i>=0; i--)
        {
            if(s.charAt(i) == ' ')
            {
                s2 += s.substring(i, prev ) + " ";
                prev = i;
            }
        }
        s2 += s.substring(0, prev);
        return s2.trim();
    }

    public static void main(String[] args)
    {

        System.out.println(reverseWords("This is my book"));
    }
}
