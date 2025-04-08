package day1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("please enter an integer number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();		//6
		int factorial = 1;		//the reason to keep 1 is because we don't want the initial value affect the final result
		
		//calculate the factorial 
//		factorial = 6*5*4*3*2*1;    //120*6
		//loop
		for(int i=1 ; i<=number  ; i++ ) {
			factorial *= i;
		}
		
		/*
		factorial *= 1;
		factorial *= 2;
		factorial *= 3;
		factorial *= 4;
		factorial *= 6;
		factorial *= 7;
		*/
		
		
		System.out.println("the factorial of "+number+" is:"+factorial);
	}

}
