package predefinedInterfaces.predicate.employeeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo {

    public static void display(Predicate<Employee> p, List<Employee> list)
    {

        for(Employee e: list)
        {
            if(p.test(e))
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("Vipul", "Developer", 10000, "Delhi"));

        list.add(new Employee("Ajay", "DevOps", 30000, "Chandigarh"));

        list.add(new Employee("Sunny", "QA", 20000, "Pune"));

        list.add(new Employee("Vicky", "Lead", 50000, "Chennai"));

        list.add(new Employee("Mark", "Manager", 80000, "Mumbai"));

        list.add(new Employee("Tony", "Manager", 40000, "Pune"));


        System.out.println("Lambda expression implementation");

        System.out.println("Find all employess with Manager designation");

        Predicate<Employee> p1 = (emp) -> emp.designation.equals("Manager");

        display(p1, list);

        System.out.println();

        System.out.println("Find all employess with Pune city");

        Predicate<Employee> p2 = (emp) -> emp.city.equals("Pune");

        display(p2, list);

        System.out.println();

        System.out.println("Find all employess with salary less than 30K");

        Predicate<Employee> p3 = (emp) -> emp.salary < 30000;

        display(p3, list);

        System.out.println();

        System.out.println("Find all managers in Pune locatioon");

        display(p1.and(p2), list);

        System.out.println();

        System.out.println("Find all employees who are either manager or has salary less than 30K");

        display(p1.or(p3), list);

        System.out.println();

        System.out.println("Find all employees who are not managers");

        display(p1.negate(), list);









    }

}
