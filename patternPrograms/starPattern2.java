package patternPrograms;

import java.util.Scanner;

public class starPattern2 {

	
	
	public static void main(String args[]) {
		
		starPattern2 pat = new starPattern2();
//		pat.pattern1();
//		pat.Pattern2();
//		pat.pyramid();
//		pat.pyramidPattern();
//		pat.ReversePyramid();
		pat.DiagonalPattern();
	}
	
	// Triangle patttern
	public static void pattern1() {
		
		
		System.out.println("printing triangle pattern");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		for(int i=0;i<=rows;i++) {
			
			for(int j=rows;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
	
	//traingle - solution2
	public static void Pattern2() {
		 
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=1;j--) {
				
				if(j > i) {
					
					System.out.print(" ");
				}
				
				else {
					System.out.print(" *");
				}
			}
			
			System.out.println();
		}
	}
	
	//Pyramid Pattern 
	public static void pyramid() {
		
		System.out.println("Pyramid Pattern");
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
			}
			
			for(int n=2;n<=i;n++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	//Pyramid pattern - solution 2
	public static void pyramidPattern() {
		
		System.out.println("Pyramid Pattern");
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<(i*2);k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
	}
	}
	
	//reverse pyramid pattern
	public static void ReversePyramid() {
		
		System.out.println("Reverse pyramid pattern");
		
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--) {
				
				System.out.print("*");
			}
			
			for(int n=3;n>=i;n--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	//Diagonal pattern
	public static void DiagonalPattern() {
		
		
		System.out.println("Printing diagonal pattern");
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				if(i>=2 && j<=i-1) {
					
					System.out.print(" ");
				}  
				
				else {
					
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
	
	
	
	
}
