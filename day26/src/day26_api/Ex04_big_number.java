package day26_api;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ex04_big_number {
	public static void main(String[] args) {
		
		// primitive type의 최대값
		
		// int 형 최대값
		System.out.println(Integer.MAX_VALUE);
		
		// long 형 최대값
		System.out.println(Long.MAX_VALUE);
		
		// BigInteger 클래스를 활용해서 long 타입 이상(이하)의 값을 저장한다.
		// int 와 long 보다 큰 값을 저장시킬 때는 int 와 long이 다 담지 못하기 때문에 문자열로 저장해야 한다.
		BigInteger a = new BigInteger("1234567898765432123456789");		// import 해야 한다.
		BigInteger b = new BigInteger("987654321234567898765432123456789");		// import 해야 한다.
		
		System.out.println(a);
		System.out.println(b);
		
		// BigInteger 클래스의 필드값				// 이거 왜 쓰는 거지?
		System.out.println(BigInteger.ZERO);
		System.out.println(BigInteger.ONE);
		System.out.println(BigInteger.TWO);
		System.out.println(BigInteger.TEN);
		
		// 사칙연산
		System.out.println(a.add(b));			// +
		System.out.println(a.subtract(b));		// -
		System.out.println(a.multiply(b));		// *
		System.out.println(a.divide(b));		// /
		
		// BigDecimal 클래스를 이용해서 실수의 소수자릿수를 손실 없이 사용할 수 있다.
		double c = 1.12345678987654321987654321;
		BigDecimal d = new BigDecimal("1.12345678987654321987654321");		
		// import 해야 하며 이 또한 문자열로 저장해준다.
		
		
		System.out.println(c);
		System.out.println(d);
		
		
		
		
		
		
		
	}
}
