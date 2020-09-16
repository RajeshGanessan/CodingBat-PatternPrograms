package codingBat;

public class Logic1 {


	public static void main(String[] args) {

		Logic1 logic = new Logic1();

		System.out.println(logic.sumLimit(8, 3));

		System.out.println(logic.roundSum(13,13,13));

	}

	public int sumLimit(int a, int b) {


		int sum = a + b;
		int sumLen = String.valueOf(sum).length();

		int as = String.valueOf(a).length();
		int bs = String.valueOf(b).length();

		if (sumLen == as) {
			return sum;
		} else {
			return a;
		}
	}

	//RoundSum
	public int roundSum(int a , int b , int c) {

		return round10(a)+round10(b)+round10(c);
	}

	//ROundSum - for calculating The round10
	private int round10(int n) {

		if(n % 10 < 5){
			return n - (n%10);
		} else
		{
			return n + (10 - (n%10));

		}
	}

	//CloseFar
	public boolean closeFar(int a, int b,int c){

		if(Math.abs(a-b )<=1 && Math.abs(b-c) >=2  && Math.abs(c-a) >=2){
	return true;
		} else if(Math.abs(c-a)<=1 && Math.abs(a-b) >=2 && Math.abs(b-c) >=2){
	return true;
		}else {
			return false;
		}
	}

	//BlackJack
	public int blackJack(int a,int b){

		if(a>21 && b>21){
			return 0;
		} else if( a > 21){
			return b;
		} else if ( b> 21){
			return a;
		}
		int sumA = 21-a;
		int sumB = 21-b;

		if(sumA > sumB){
			return b;
		}else {
			return a;
		}
	}

	//evenlySpaced
	public void evenlySpaced(int a, int b, int c) {
		if (a + 2 == b) if (b + 2 == c) if ((a + 2 == c) || (c - 2 == a));

	}



}

