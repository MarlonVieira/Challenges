package br.com.alura.challenges.main;

import br.com.alura.challenges.model.Task;
import br.com.alura.challenges.services.Functions;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
    }
}
