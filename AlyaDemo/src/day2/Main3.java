package day2;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secretNumber = 1234;
		int attempts = 0;
		while(true) {
			
			System.out.println("guess:");
			int guess = scanner.nextInt();
			attempts++;
			if(guess==secretNumber) {
//				when it's correct , break
				System.out.println("congratulations!!you use "+attempts +" times");
				break;
			}else if(guess>secretNumber) {
				System.out.println("too high");
			}else if(guess<secretNumber) {
				System.out.println("too low");
			}else if(guess==0) {
				System.out.println("you give up at "+(attempts-1) +" attempts");
			}
			
		}
	}

}
