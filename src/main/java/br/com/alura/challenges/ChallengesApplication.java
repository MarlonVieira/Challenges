package br.com.alura.challenges;

import br.com.alura.challenges.main.MainChallenges;
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
		MainChallenges mainChallenges = new MainChallenges();
		//mainChallenges.ExecChallengesOne();
		mainChallenges.ExecChallengesTwo();
	}
}