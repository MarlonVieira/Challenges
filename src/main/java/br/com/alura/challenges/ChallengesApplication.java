package br.com.alura.challenges;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ChallengesApplication implements CommandLineRunner  {

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
	}
}