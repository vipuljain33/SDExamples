package lambdas;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class comparatorImplementation {

    public static void main(String[] args)
    {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, 250000, "HP Laptop"));
        list.add(new Product(2, 50000, "Dell Laptop"));
        list.add(new Product(3, 80000, "Apple Mac"));

        System.out.println("Sorting on the basis of name");

        Collections.sort(list, (p1, p2) -> {

            return p1.id - p2.id;

        });



        for(Product p : list)
        {
            System.out.println(p.id + " "+ p.name + " "+ p.price);
        }





    }


}

class Product{
    int id;
    String name;
    float price;


    public Product(int id, float price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

