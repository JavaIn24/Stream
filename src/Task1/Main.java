package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> product = new ArrayList<>();
        product.add("Карп");
        product.add("Редис");
        product.add("Килька");
        product.add("Карбонад");
        product.add("Хлеб");
        product.add("Гречка");
        int  sortproduct = (int) product.stream().filter(s -> s.contains("Г")).count();
        System.out.println(sortproduct);



    }
}
