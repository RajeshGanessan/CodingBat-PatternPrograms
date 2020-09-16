package patternPrograms;

import java.util.Scanner;

public class NumberPatternPractice {

	
	public static void main(String args[]) {
		
				
//		NumberPattern();
//		NumberPattern1();
		NumberPattern2();
		
	}
	
	public static void NumberPattern() {
		
		
		System.out.println("Number Pattern Generation");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of rows");
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=rows;j>=i;j--) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}	
	}
	
	//Number pattern 2
		public static void NumberPattern1() {
		
		
		System.out.println("Number Pattern Generation");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of rows");
		int rows = sc.nextInt();
		
	       for (int i = 1; i <= rows; i++) 
	        {
	    	   
	            for (int j = 1; j <= i; j++) 
	            { 
	                System.out.print(j+" "); 
	            }
	            
	            for (int j = i-1; j >= 1; j--)
	            {
	                System.out.print(j+" ");
	            }
	            
	            System.out.println();
		}
		}
		
		//Number pattern
		/* 0000000 
			0100000 
			0020000
			0003000
			0000400
			0000050
			0000006 */
		public static void NumberPattern2() {
			
			System.out.println("Pattern -2");
			 
			
			Scanner sc = new Scanner(System.in);
			
			int rows = sc.nextInt();
			for(int i=0;i<=rows;i++) {
				
				for(int j=0;j<=rows;j++) {
					
					if(i==j) {
						System.out.print(i);
					}
					else {
						System.out.print(0);
					}
				}
				
				System.out.println();
			}
		}
}
