package day19_RecursiveCall;

class PlusFuntion {
	
	public static int plus(int n) {
		if (n == 0) return 0;
		return n += plus(n - 1);
	}
}

public class Ex03_Recursive_call {
	public static void main(String[] args) {

		
		int N = 5;
		System.out.print("1부터 " + N + "까지의 합계 : " + PlusFuntion.plus(5));
		
		
		
		
		
	}
}
