package lambdas.comparatorExample.userDefinedClassExample;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student(111, "Tom");
        Student s2 = new Student(24, "Dick");
        Student s3 = new Student(32, "Harry");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Before Sorting");

        System.out.println(list);

        Collections.sort(list, (e1, e2) -> e1.id < e2.id?-1:e1.id > e2.id?1:0);

        System.out.println("After Sorting in ascending order");

        System.out.println(list);

        Collections.sort(list, (e1, e2)-> e1.id < e2.id?1:e1.id > e2.id?-1:0);

        System.out.println("After sorting in descending order");

        System.out.println(list);







    }
}
