package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class NumberWordsApplication {
	private final NumberWords numberWords;
	public NumberWordsApplication() {
		numberWords = new NumberWords();
	}

	public void execute() {
		boolean start = true;
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Welcome to Number to Words Apllication, \n Type '0' to exit the program");
		do {

			int userResponse = scanner.nextInt();
			if (userResponse == 0) {
				start = false;
				scanner.close();
				System.out.println("Thanks for using Lijith's Number to Word Application!");
			} else {
				System.out.println(userResponse + " = "
						+ numberWords.toWords(userResponse));
			}
		} while (start);
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute();
	}

}

