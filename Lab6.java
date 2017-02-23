//Faaris Kathrada
//V00863301
//CSC110 B01

import java.util.*;

public class Lab6 {
	public static void main (String[] args) {
		Random generator = new Random (System.currentTimeMillis());
		int n;
		for(int i = 0; i < 6; i++) {
			n = generator.nextInt(49) + 1;
			System.out.println(n);
		}
		method1();
		n = generator.nextInt(6)+1;
		Scanner userInput= new Scanner(System.in);
		game(userInput,n);
	}

	public static void method1() {
		Random generator=new Random (System.currentTimeMillis());
		int n = generator.nextInt(10);
		System.out.println("n="+n);
	}

	public static void game(Scanner console, int key) {
		String prompt = "Guess a number between 1 and 6. Enter q to quit  ";
		System.out.print(prompt);
		String input=console.next();

		if(input.equalsIgnoreCase("q")) {
			System.out.println("Goodbye!");
			System.exit(1);
		}
		try{
			int n = Integer.parseInt(input);
			if (n==key) {
					System.out.println("You have guessed the right number!");
			} else {
				System.out.println("You didn't guess the right number. The key is " +key);
			}
		} catch(NumberFormatException e) {
			System.out.println("You should enter an integer, not \""+input+"\". Bye!");
			System.exit(1);
		}
	}
}