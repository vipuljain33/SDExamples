package predefinedInterfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class Demo2 {


    public static void main(String[] args)
    {

        Student s1 = new Student("Amit", 80);
        Student s2 = new Student("Tom", 50);
        Student s3 = new Student("Sunnny", 100);
        Student s4 = new Student("Harry", 23);
        Student s5 = new Student("Tim", 60);


        ArrayList<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Function<Student, String> fun = student -> {
            int marks = student.marks;

            if(marks >= 80)
            {
                return "Distinction";

            }else  if(marks >=70 && marks < 80)
            {
                return "A";
            }else if(marks >= 60 && marks< 70)
            {
                return "B";
            }

            return "Failed";

        };


        for(Student s : students)
        {
            System.out.print(s.name + " "+ s.marks + " "+ fun.apply(s));
            System.out.println();
        }


    }
}



class Student{

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
