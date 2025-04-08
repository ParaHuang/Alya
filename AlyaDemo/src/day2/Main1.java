package day2;

public class Main1 {

	public static void main(String[] args) {
		//if...else if...else if...else
		
		//see the several possible value of an expression
		//switch...case...
//		int day = 1;
		//1->Monday, 2->Tuesday,7->Sunday, others-invalid
		/*
		switch(day) {
			case value1:
				operationA;
				break;
			case value2:
				operationB;
				break;
			case value3:
				operationC;
				break;
			case value4:
				operationD;
				break;
			default:
				operationE;
		}
		*/
//		if(day==1) {
//			
//		}else if(day==2) {
//			
//		}else if(day==3) {
//			
//		}else if(day==4) {
//			
//		}else if(day==5) {
//			
//		}
//		int day = 1;
//		switch(day) {
//			case 1:
//				System.out.println("Monday");
//				break;
//			case 2:
//				System.out.println("Tuesday");
//				break;
//			case 3:
//				System.out.println("Wednesday");
//				break;
//			default://handle the rest situation
//				System.out.println("invalid");
//		}
		
		//break with loop
		
//		for(int i=1 ; i<=5 ; i++) {
//			if(i==3) {
//				break;		//interrupt the loop
//			}
//			System.out.println(i);
//		}
		
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				if(j==3) {
					break;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("the end---");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
