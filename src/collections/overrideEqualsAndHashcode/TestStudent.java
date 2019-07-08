package collections.overrideEqualsAndHashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestStudent {

    public static void main(String[] args) {

        Student amit1 = new Student("Amit", 1);
        Student amit2 = new Student("Amit", 1);

        System.out.println("Amit1 hashcode = "+ amit1.hashCode());
        System.out.println("Amit2 hashcode = "+ amit2.hashCode());
        System.out.println("Checking equality of amit1  and amit2 = "+ amit1.equals(amit2));

        System.out.println();

        Student amit = new Student("Amit",1);

        //Adding and searching same student in the ArrayList

        List<Student> studentList = new ArrayList<>();
        studentList.add(amit);

        System.out.println("Size of studentlist = "+ studentList.size());
        System.out.println("StudentList Contains Amit = "+ studentList.contains(new Student("Amit", 1   )));

        System.out.println();


        //Adding and searching same student in the HashSet.
        //Since hashset works on the buckets that contains hashcode of the objects, then only overriding equals will not work

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(amit1);
        studentSet.add(amit2);

        System.out.println("Student set size = "+ studentSet.size());
        System.out.println("Student set contains Amit = " + studentSet.contains(new Student("Amit", 1)));







    }



}
