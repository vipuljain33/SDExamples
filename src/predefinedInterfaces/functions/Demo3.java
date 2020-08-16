package predefinedInterfaces.functions;

import jdk.nashorn.internal.ir.FunctionNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args)
    {

        ArrayList<Employee> employees = new ArrayList<>();


        employees.add(new Employee("Amit", 20000));
        employees.add(new Employee("Tom", 30000));
        employees.add(new Employee("Sunnny", 90000));
        employees.add(new Employee("Henry", 60000));
        employees.add(new Employee("Mark", 50000));

        Predicate<Employee> p = e -> e.salary >= 50000;

        Function<Employee, Employee> f = e -> {

            if(p.test(e))
            {
                e.salary = e.salary + 5000;
            }

            return e;
        };


        for(Employee employee: employees)
        {
            System.out.println(f.apply(employee));
        }



        Function<List<Employee>, Double> fun = employeeList -> {
            double totalMonthlySalary = 0 ;
            for(Employee e : employeeList)
            {
                totalMonthlySalary += e.salary;
            }

            return totalMonthlySalary;
        };


        System.out.println("Total Monthly Salary for all the employees = "+ fun.apply(employees));




    }

}


class Employee
{

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
