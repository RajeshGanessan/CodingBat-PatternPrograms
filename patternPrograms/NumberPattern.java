package patternPrograms;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class NumberPattern {

	
	public static void main(String args[]) {
		
		NumberPattern pat = new NumberPattern();
		
		pat.pattern2();
//		pat.Pattern3();
//		pat.pattern4();
//		pat.FloydsTriangle();		
//		pat.pattern5();
//		pat.Pattern7();
//		pat.pattern8();
	}

	
	//number pattern
	public static void Pattern1() {
		
		System.out.println("Printing number pattern");
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
	      
	//pattern 2
	
	/* 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 1234
	 * 123
	 * 12
	 * 1
	 */
	public static void pattern2() {
		
		Scanner sc  = new Scanner(System.in);
		
		int row = sc.nextInt();
		int dobleRow = 2*row;
		
		System.out.println("Printing number Pattern");
		
		for(int i=1;i<=dobleRow-1;i++) {
			
			for(int j=1,k=1;j<=k;j++) {
				if(i>row) {
					k=dobleRow-i;
				}
				else
					k=i;
				System.out.print(j);
			}
			
			System.out.println();
			
		}
		
		/*
		 * for(int i=4;i>0;i--) {
		 * 
		 * for(int j=1;j<=i;j++) {
		 * 
		 * System.out.print(j); }
		 * 
		 * System.out.println(); }
		 */
	}
	
	//pattern 
	public static void Pattern3() {
		
		System.out.println("pattern generation");
		
		for(int i=5;i>0;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	//pattern4
	/* 
	 * 1
		21
		321
		4321
		54321
			 */
	public static void pattern4() {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			} 
			
			System.out.println();
		}
	}
	
	//Floyd's triangle
	public static void FloydsTriangle() {
		
		int num = 1;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(num+ " ");
				num++;
			}
			
			System.out.println();
		}
	}
	
	//Pattern5
	/*
	 * 54321
		5432
		543
		54
		5
	 */
	public static void pattern5() {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	//Pattern7
	public static void Pattern7() {

		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	//pattern8
	/*5 4 3 2 1 
		4 3 2 1 
		3 2 1 
		2 1 
		1 
		1 
		2 1 
		3 2 1 
		4 3 2 1 
		5 4 3 2 1*/
	public static void pattern8() {
		
		for(int i=5;i>=1;i--) {
			
			for(int j=i;j>=1;j--) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			
			for(int j=i;j>=1;j--) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
	

//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5 
//6 6 6 6 6 6
//7 7 7 7 7 7 7

public static void patternrj() {
	
	
	System.out.println("Enter the rows for generating pattern");
	
	Scanner sc = new Scanner(System.in);
	
	int rows = sc.nextInt();
	
	for(int i=1;i<=rows;i++) {
		
		for(int j=1;j<=i;j++) {
			
			System.out.print(i+ " ");
		}
		
		System.out.println();
}
}
}