package day29_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		
		// 1 ~ 10000 사이의 정수를 저장한 ArrayList 생성
		Integer[] intArray = new Integer[10000];
		List<Integer> list = new ArrayList<>(10000);
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (i + 1);
			list.add(intArray[i]);
		}
		
		long start = System.nanoTime();
		
		// 맨 뒤의 데이터부터 순차적으로 삭제 (2,625,700ns)
		while(true) {
			int size = list.size() - 1;
			list.remove(size);
			if(size <= 0) break;
		}
		
		// 맨 처음 데이터부터 순차적으로 삭제 (12,095,000ns)
		// 지우고 당기고 지우고 당기고를 반복하기 때문에 훨씬 오래 걸린다.
//		int cnt = 0;
//		while(true) {
//			int size = 0;
//			list.remove(size);
//			cnt++;
//			if(cnt == 10000) break;
//		}
		
		long end = System.nanoTime();
		
		System.out.println("총 경과시간 : " + (end - start) + "ns");
		System.out.println(list);
	}
}

// 41:50

