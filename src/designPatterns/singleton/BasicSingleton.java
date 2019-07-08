package designPatterns.singleton;

import java.io.*;

public class BasicSingleton implements Serializable {

    private int value;

    private BasicSingleton()
    {

    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance()
    {

        return INSTANCE;


    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    protected Object readResolve()
    {
        return INSTANCE;
    }
}


class Demo{

    static void saveToFile(BasicSingleton singleton, String fileName) throws Exception
    {

        try(FileOutputStream fileOut = new FileOutputStream(fileName);ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(singleton);

        }

    }

    static BasicSingleton readFromFile(String fileName) throws Exception
    {
        try(FileInputStream fileInput = new FileInputStream(fileName);ObjectInputStream in = new ObjectInputStream(fileInput)) {

            return (BasicSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        BasicSingleton singleton = BasicSingleton.getInstance();

        singleton.setValue(111);
        System.out.println(singleton.getValue());

        //Breaking singleton design pattern through singleton

        String fileName = "singleton.bin";
        saveToFile(singleton, fileName);

        singleton.setValue(222);

        BasicSingleton singleton2 = readFromFile(fileName);

        System.out.println(singleton == singleton2);
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());




    }

}
