package designPatterns.builderPattern;

public class Demo {

    public static void main(String[] args) {

        Computer.ComputerBuilder builder = new Computer.ComputerBuilder("500 GB", "4 GB");
        builder.setBluetoothEnabled(true);
        builder.setGraphicsEnabled(false);
        Computer computer = builder.build();
        System.out.println(computer);


    }
}
