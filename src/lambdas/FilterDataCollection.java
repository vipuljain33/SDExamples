package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDataCollection {

    public static void main(String[] args)
    {

        List<Prod> list = new ArrayList<>();
        list.add(new Prod(1, "Samsung A5", 17000f));
        list.add(new Prod(2, "IPhone 6s", 30000f));
        list.add(new Prod(3, "Sony Xperia", 25000));
        list.add(new Prod(4, "Nokia Lumia", 20000f));

        Stream<Prod> filteredData = list.stream().filter(p -> p.price > 20000f);

        filteredData.forEach(
                (n) -> System.out.println(n.name+ " "+ n.price)
        );

    }
}

class Prod{

    int id;
    String name;
    float price;

    public Prod(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
