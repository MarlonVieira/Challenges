package br.com.alura.challenges.main;

import br.com.alura.challenges.model.Task;
import br.com.alura.challenges.services.Functions;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MainChallenges {
    private Scanner scan = new Scanner(System.in);

    public void ExecChallengesOne() throws IOException {
        System.out.printf("Enter a number to do the count: ");
        Integer number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.printf(i + " - ");
        }

        Task task = new Task("Challenge task", false, "Marlon");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("task.json"), task);
        System.out.println("\nData was saved in task.json!");

        ObjectMapper readObjectMapper = new ObjectMapper();
        Task readTask = readObjectMapper.readValue(new File("task.json"), Task.class);
        System.out.println(readTask);
    }

    public void ExecChallengesTwo() {
        System.out.printf("Enter the first number to multiplicate: ");
        Integer numberA = scan.nextInt();

        System.out.printf("Enter the second number to multiplicate: ");
        Integer numberB = scan.nextInt();

        Functions functions = new Functions();
        System.out.println(functions.multiplicate(numberA, numberB));

        System.out.printf("Enter a number to check if is a prime: ");
        Integer numberPrime = scan.nextInt();

        System.out.println(functions.primeNumber(numberPrime));

        System.out.printf("Enter the first number to divide: ");
        Integer numberC = scan.nextInt();

        System.out.printf("Enter the second number to divide: ");
        try {
            Integer numberD = scan.nextInt();
            System.out.println(functions.divide(numberC, numberD));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ExecChallengesThree() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);

        max.ifPresent(System.out::println);


        List<String> words = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> group = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(group);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        String concatenate = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(concatenate);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumSquare = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sumSquare);

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6);
    }
}
