package lambdas.comparatorExample;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.imageio.stream.IIOByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {


    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();


        list.add(15);
        list.add(0);
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(23);

        System.out.println("Before Sorting "+ list);

        //Sorts list as per default sorting mechanism
        Collections.sort(list);

        System.out.println("After default Sorting "+ list);

        //Collections.sort(list, new MyComparator());


        //Lambda expression for customized sorting
        Collections.sort(list, (o1,o2)-> o1>o2?-1:o1<o2?1:0);

        System.out.println("After customized sorting "+ list);

        TreeSet<Integer> t = new TreeSet<>();

    }
}
