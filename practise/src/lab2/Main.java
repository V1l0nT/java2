package src.lab2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Human> humans = Arrays.asList(
                new Human(25, "Анна", "Некрасова", LocalDate.of(1996, 5, 15), 65),
                new Human(30, "Борис", "Петров", LocalDate.of(1991, 8, 20), 70),
                new Human(40, "Роман", "Белов", LocalDate.of(1981, 3, 10), 80),
                new Human(35, "Кирилл", "Иванов", LocalDate.of(1986, 12, 5), 75)
        );

        System.out.println("Исходный список людей:");
        humans.forEach(System.out::println);

        // Сортировка по возрасту в обратном порядке
        List<Human> sortedByAgeReverse = humans.stream()
                .sorted(Comparator.comparingInt(Human::getAge).reversed())
                .toList();
        System.out.println("\nСписок после сортировки по возрасту в обратном порядке:");
        sortedByAgeReverse.forEach(System.out::println);

        // Фильтрация по имени, начинающемуся с "А"
        List<Human> nameStartsWithA = humans.stream()
                .filter(h -> h.getFirstName().startsWith("А"))
                .toList();
        System.out.println("\nСписок после фильтрации по имени, начинающемуся с 'А':");
        nameStartsWithA.forEach(System.out::println);

        // Сортировка по дате рождения
        List<Human> sortedByDateOfBirth = humans.stream()
                .sorted(Comparator.comparing(Human::getBirthDate))
                .toList();
        System.out.println("\nСписок после сортировки по дате рождения:");
        sortedByDateOfBirth.forEach(System.out::println);

        // Расчет среднего веса
        double averageWeight = humans.stream()
                .mapToInt(Human::getWeight)
                .average()
                .orElse(0);
        System.out.println("\nСредний вес: " + averageWeight);
    }
}

