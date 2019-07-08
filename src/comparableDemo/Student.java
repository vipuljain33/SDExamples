package comparableDemo;

public class Student implements Comparable<Student> {


    int rollNo;
    int age;
    String name;

    public Student(int rollNo, String name, int age){

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;

}
    @Override
    public int compareTo(Student st) {
        //return Integer.compare(this.rollNo, st.rollNo);

        if(this.rollNo < st.rollNo)
        {
            return -1;
        }else if(this.rollNo > st.rollNo)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
