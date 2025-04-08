package day2;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;		//calculating how many correct numbers
		while(true) {
			System.out.println("enter "+(count+1)+" number:");
			int num = scanner.nextInt();	//the number you input
			
			if(num>0) {	//correct
				count++;
			}
			
			
			if(count==5) {
				break;
			}
			
		}
	}

}
