package designPatterns.prototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vipuljain on 08/01/19.
 */
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees()
    {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list)
    {
        this.empList = list;
    }

    public void loadData(){

        //read all employees data from database and put into this list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList()
    {
        return empList;
    }


    public Object clone() throws CloneNotSupportedException
    {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);

    }
}
