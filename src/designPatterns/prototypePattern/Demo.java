package designPatterns.prototypePattern;

/**
 * Created by vipuljain on 08/01/19.
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emp = new Employees();
        emp.loadData();

        for(String s : emp.getEmpList())
        {
            System.out.print(s + " ");
        }

        System.out.println();

        //Use the clone method to get the Employee object

        Employees empNew = (Employees) emp.clone();

        empNew.getEmpList().add(0, "Vipul");
        for(String s :empNew.getEmpList()){
            System.out.print(s + " ");
        }
    }
}
