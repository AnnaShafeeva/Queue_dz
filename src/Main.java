import java.util.*;

public class Main {

    public static void main(String[] args) {

        Deque<Person> persons = new ArrayDeque<>(generateClients());

        while (!persons.isEmpty()) {

            Person c = persons.poll();
            c.ticket--;
            System.out.println(c + " прокатился на аттракционе ");
            if (c.ticket != 0) {
                persons.addLast(c);
            }

        }

    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Петя", "Иванов", 5));
        list.add(new Person("Вася", "Петров", 2));
        list.add(new Person("Олег", "Сидоров", 1));
        list.add(new Person("Оля", "Потапенко", 3));
        list.add(new Person("Таня", "Василева", 4));

        return list;
    }

}
