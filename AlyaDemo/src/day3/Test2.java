package day3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int,double
		Scanner scanner = new Scanner(System.in);
		
//		type[] arrayName = new type[length];
		//define an array, it only saves 
		int[] arr = new int[5];	
		//index:0 ~ length-1
//		arr[0] = 89;
//		arr[1] = 77;
//		arr[2] = 12;
//		arr[3] = 22;
//		arr[4] = 78;
//		arr[5] = 100;
		
//		arr[0] = scanner.nextInt();
//		arr[1] = scanner.nextInt();
//		arr[2] = scanner.nextInt();
//		arr[3] = scanner.nextInt();
//		arr[4] = scanner.nextInt();
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = scanner.nextInt();
		}

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		int num = 10;
	}

}
