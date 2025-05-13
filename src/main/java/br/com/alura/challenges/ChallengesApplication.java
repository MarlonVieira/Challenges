package br.com.alura.challenges;

import br.com.alura.challenges.model.Task;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class  ChallengesApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(ChallengesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);

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
}