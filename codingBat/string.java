package codingBat;

public class string {

	
	public static void main(String[] args) {
		
		
//		System.out.println(middleTwo("String"));
		
		System.out.println(endsLy("oddy"));
	}
		
		public static  String middleTwo(String str) {
			  
			  int strhalf = str.length()/2;
			 
			  return str.substring(strhalf + str.length()-strhalf);
	}
		
		public static boolean endsLy(String str) {
			  
			String end = str.substring(Math.max(str.length() - 2, 0));
			  System.out.println(end);
			  
			  if(end.equals("ly")){ 
			    return true;
			    
			  }
			  
			  return false;
			}

}
