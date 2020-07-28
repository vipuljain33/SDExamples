package lambdas.comparatorExample.treesetExample;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args)
    {


        TreeSet<Integer> treeSet = new TreeSet<>((o1,o2)-> o1>o2?-1:o1<o2?1:0);

        treeSet.add(15);
        treeSet.add(10);
        treeSet.add(46);
        treeSet.add(30);
        treeSet.add(20);

        System.out.println(treeSet);

    }
}
