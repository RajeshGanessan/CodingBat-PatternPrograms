package codingBat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringProblems {

	
	public static void main(String[] args) {
		
		StringProblems prob = new StringProblems();
		
//		System.out.println(prob.countHi("abc hi ah hi"));
//		System.out.println(prob.catDog("catcat"));
//		System.out.println(prob.countCode("asfdsadcoddesadfsdf"));
//		System.out.println(prob.endOther("afdffraj","rartytraj"));
		prob.xyzThere();
	}
	
	
	public int countHi(String str) {
		
		int count = 0;
		for(int i=0;i<str.length()-1;i++) {
			
			if(str.charAt(i)== 'h'&& str.charAt(i+1)=='i') {
				count++;
			}
			
		}
		return count;
	}
	
	public boolean catDog(String str) {
		
		int Catcount =0;
		int Dogcount =0;
		
		for(int i=0;i<str.length()-1;i++) {
			
			if(str.substring(i, i+3).equalsIgnoreCase("cat")) {
				Catcount+=1;
			}
			
			if(str.substring(i, i+3).equalsIgnoreCase("dog")) {
				Dogcount+=1;
			}
		}
		if(Catcount==Dogcount) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int countCode(String str) {
		  
		int count=0;
		
		for(int i=0;i<str.length()-3;i++) {
			
			if(str.substring(i, i+4).equalsIgnoreCase("code")) {
				count++;
			}
		}
		
		return count;
	}
	
	public boolean endOther(String a, String b) {
		
		a = a.toLowerCase();
		int alen = a.length();
		
		a=b.toLowerCase();
		int blen = b.length();
			
		if(alen < blen) {
			
			String temp = b.substring(blen - alen, blen);
			if(temp.compareTo(a)== 0) {
				return true;
			}
			return  false;	
		}
		else {
			
			String temp = a.substring(alen-blen, alen);
			if(temp.compareTo(b) == 0) {
				return true;
			}
			return false;
		}
	}
	
	public void xyzThere() {
		  
		 int numberOfDays = 7;
		    DateFormat date = new SimpleDateFormat("MMM dd yyyy");
		    Calendar cal = Calendar.getInstance();
		    cal.add(cal.DATE, numberOfDays);
		    String toDate = date.format(cal.getTime());
		    System.out.println(toDate);

	}
}
