package test;

import java.math.BigInteger;

public class Test02 {
	public static void main(String[] args) {
		
		
//			Test02.java
//			1! ~ 99! 까지 전체 결과를 출력하시오.
//			1! (1 팩토리얼) = 1
//			2! (2 팩토리얼) = 1 * 2 = 2
//			3! (3 팩토리얼) = 1 * 2 * 3 = 6
//			...
//			99!
		 
		
		
		StringBuffer sb = new StringBuffer("1");
		int a = 1;
		BigInteger r = new BigInteger("2");
		BigInteger x = new BigInteger("1");
		BigInteger result = new BigInteger("2");
		
		
		String p = a + "! (" + a + " 팩토리얼) = " + sb;
		System.out.println(p);
		
		for (int i = 2; i < 100; i++) {
		sb.append(" * " + i);
		p = i + "! (" + i + " 팩토리얼) = " + sb + " = " + result;
		System.out.println(p);
		r = r.add(x);
		result = result.multiply(r);
		}
	}
}
