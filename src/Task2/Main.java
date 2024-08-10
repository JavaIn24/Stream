package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Оля", 23));
        personList.add(new Person("Коля", 33));
        personList.add(new Person("Лена", 22));
        personList.add(new Person("Петя", 12));
        personList.add(new Person("Вася", 29));
        personList.add(new Person("Олег", 44));
        personList.add(new Person("Дима", 23));
        personList.add(new Person("Галя", 32));
        personList.add(new Person("Ира", 56));
        personList.add(new Person("Алена", 31));
        personList.stream().filter(age ->age.getAge() > 30)
                .forEach(name -> System.out.println(name.getName() + " " + name.getAge()));

    }
}
