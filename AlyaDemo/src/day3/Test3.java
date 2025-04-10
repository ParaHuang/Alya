package day3;

import java.util.Scanner;

public class Test3 {
	
	public static int getMax(int[] array){
		//method body
		int max = array[0];
		for(int i=1 ; i<array.length ; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int getMin(int[] array){
		//method body
		int min = array[0];
		for(int i=1 ; i<array.length ; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	static void printHello() {
		System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("how many student?");
		int num = scanner.nextInt();
		
		int[] grades = new int[num];
		System.out.println("Enter "+num+" grades:");
		
		for(int i=0 ; i<num ; i++) {
			System.out.print("Grade "+(i+1)+":");
			grades[i] = scanner.nextInt();
		}
		
		int max = getMax(grades);
		System.out.println("Maximum grade:"+max);
		int min = getMin(grades);
		System.out.println("Minimum grade:"+min);
		
//		if(max%2==0) {
//			System.out.println();
//		}
		
//		printHello();//no effect to the rest code
		
		
		
	}
	
	
	
	
}
