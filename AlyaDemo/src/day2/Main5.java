package day2;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many employees?");
		int many = scanner.nextInt();
		int totalOld = 0;
		int totalIncrease = 0;
		int total = 0;
		
		int count = 0;		//calculating how many correct numbers
		while(true) {
			System.out.println("employee "+(count+1)+" salary:");
			int salary = scanner.nextInt();	//the number you input
			
			switch (salary) {
			case 500:
				System.out.println("increase:");
				System.out.println("after increase:");
				totalOld += salary;
				totalIncrease += 250;
				total += totalOld+totalIncrease;
				break;
			case 1000:

				totalOld += salary;
				totalIncrease += 500;
				total += totalOld+totalIncrease;
				break;
			case 2000:

				totalOld += salary;
				totalIncrease += 750;
				total += totalOld+totalIncrease;
				break;
			default:
				System.out.println("incorrect");
			}
			
			
			
			if(count==many) {
				break;
			}
			
		}
		System.out.println("print everything");
		
	}

}
