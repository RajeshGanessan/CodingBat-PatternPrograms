package patternPrograms;

public class starPatterns {

	
	
	public static void main(String args[]) {
		
		starPatterns pattern = new starPatterns();
		
//		pattern.pattern1and2();
//		pattern.pattern4();
//		pattern.pattern5();
	//		pattern.starPattern();
		pattern.starPattern2();
	}
	//pattern 1
	public static void pattern1() {
		
		
		/* *
		  **
		  ***
		  ****
		 */
		System.out.println("Star pattern Program-1");
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j--) {
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
	}
	
	//Reverse of pattern1z`
	public static void Reversepattern1() {

		System.out.println("Star pattern Program-1");
		
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}
	
	//Combination of pattern1 and reverse
	public static void pattern1and2() {
		
		System.out.println("Combination pattern of 1 and 2");
		
	for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	
	for(int i=1;i<=4;i++) {
		
		for(int j=3;j>=i;j--) {
			
			System.out.print(" * ");
		}
		
		System.out.println();
	}
	}
	
	//pattern 4
	/*    *
	     **
	    ***
	   ****
	 */
	public static void pattern4() {
		
		System.out.println("Printing reverse triangle");
		
		for(int i=1;i<=4;i++) {
			
			for(int j=3;j>=i;j--) 
			{
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
			
			System.out.print("*");
		}
			System.out.println();	
	}
}
	
	//Pattern progranm
	public static void pattern5() {
		
		for(int i=0;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	//pattern4
	/*
	 * * * *
	   * * *
	     * * 
	       *
	 */
	
	public static void starPattern() {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {	
				
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	/*
	 */
	//starPattern7
	public static void starPattern2() {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=3;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=3;k>=i;k--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

