package day1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("please enter an integer number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();		//4
		int accumulation = 0;			//=4+3+2+1
		for(int i=1 ; i<=number ; i++) {
			accumulation += i;
		}
		
		// accumulation += 1;       accumulation = accumulation + 1
		// accumulation += 2;
		// accumulation += 3;
		// accumulation += 4;
		// accumulation += 5;
		// accumulation += 6;
		
		
		System.out.println("the accumulation of "+number+" is:"+accumulation);
	}

}
