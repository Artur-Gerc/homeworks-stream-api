package dz_lyambda_and_stream_api.task_population_census;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        long juvenile = persons.stream().filter(x -> x.getAge() < 18).count();
        List<String> conscript = persons.stream()
                .filter(x -> x.getAge() > 18 && x.getAge() < 27)
                .filter(x -> x.getSex() == Sex.MAN)
                .map(Person::getFamily)
                .toList();


    }
}
