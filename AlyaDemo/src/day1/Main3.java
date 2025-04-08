package day1;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number of year:");
		int year = scanner.nextInt(); 
		System.out.println("please enter the number of days:");
		int days = scanner.nextInt();	//62   ->March 2 
		//62-31 = 31(after Jan)   31-28=3(after feb)
		//represent month number
		for(int i=1 ; i<=12 ; i++) {
			if(i==1 || i==3 || i==5 || i== 7 || i==8 || i==10 || i==12) {//31 days
				days -= 31;
			}else if(i==2) {//28 or 29
				if(year%4==0 && year%100!=0 || year%400==0) {
					days -= 29;
				}else {
					days -= 28;
				}
			}else {//30
				days -= 30;
			}
			
		}
		//how much i is? -> month
		
		//May 15th
		
		
		System.out.println("?Month ?Date");
	}

}
