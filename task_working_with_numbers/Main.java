package dz_lyambda_and_stream_api.task_working_with_numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intFilter = new ArrayList<>();

        /*фильтруем массив и получаем только положительные числа*/
        for (Integer a : intList) {
            if (a > 0) {
                intFilter.add(a);
            }
        }

        /*находим четные числа*/
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer a : intFilter) {
            if (a % 2 == 0) {
                evenNumbers.add(a);
            }
        }

        /*сортируем в порядке возрастания*/
        Collections.sort(evenNumbers);

        /*выводим на экран*/
        System.out.println(evenNumbers);
    }
}
