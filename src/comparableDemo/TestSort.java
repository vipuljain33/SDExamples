package comparableDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestSort {

    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(23, "Ajay", 30));
        list.add(new Student(34, "Vipul", 43));
        list.add(new Student(9, "Rahul", 39));

        Collections.sort(list);

        for(Student st : list)
        {
            System.out.println(st.rollNo+ " "+ st.name+ " "+ st.age);
        }
    }
}
