package day29_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		
		/*
		 * 	1. List 의 view 를 가진다.
		 * 	2. 다형성을 가질 수 있다.
		 * 	List<Integer> list = new ArrayList<Integer>();	// 부모의 메소드만 사용이 가능하다.
		 * 	List<Integer> list = new ArrayList<>();			// 내가 가진 것 사용하려면 다운캐스팅 해야 함
		 * 
		 * 	1. ArrayList 의 view 를 가진다.
		 * 	2. ArrayList 로 타입이 제한된다.
		 * 	ArrayList<Integer> list = new ArrayList<Integer>();
		 * 	ArrayList<Integer> list = new ArrayList<>();
		 * 	: 부모와 자신이 가진 메소드를 모두 사용할 수 있음
		 */
		
		List<Integer> list = new ArrayList<>();
		
		// 1. 데이터 저장 메소드
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(30);				// Auto Boxing (int -> Integer)
		list.add(40);				// Auto Boxing
		list.add(50);				// Auto Boxing
		
		// 2. 저장된 요소를 가지고 오는 메소드
		System.out.println("첫번째 요소 : " + list.get(0));
		System.out.println("마지막 요소 : " + list.get(4));
		
		// 3. 크기 : size()
		System.out.println("list 의 크기  : " + list.size());		// : Array 의 length
		// 1) 크기를 활용해 마지막 요소 출력 : 마지막 인덱스 = 크기 - 1
		System.out.println("마지막 요소 : " + list.get(list.size() - 1));
		// 2) 전체 요소 순회
		for (int i = 0; i < list.size(); i++) {				// 메소드 매번 호출
			System.out.println((i + 1) + "번째 요소 : " + list.get(i));
		}
		// 3) 개선된 전체 요소 순회(일반 for문)					// 메소드 호출한 것을 변수로 선언해서 사용
		for (int i = 0, size = list.size(); i < size; i++) {
			System.out.println((i + 1) + "번째 요소 : " + list.get(i));
		}
		
		// 4. 삭제 : remove(인덱스);
		// 첫번째 데이터 삭제하기
		list.remove(0);
		System.out.println("삭제된 자리의 데이터 : " + list.get(0));
		// 삭제된 요소의 자리를 비워두지 않고 두번째 자리의 값이 당겨와져서 출력된다.
		// 선입선출 구조인 큐 같은 경우 ArrayList를 사용하지 않는다.
		// 초~중반에 저장된 데이터가 자주 삭제되는 구조는 ArrayList가 부적절하다. (매우 느림)
		
		// 5. 삭제 : remove(객체);
		// 50을 찾아서 삭제하기
		list.remove(new Integer(50));
		System.out.println("마지막 요소 : " + list.get(list.size() - 1));
		
		// 6. 확인 : 저장 유무 확인 -> contains(객체);
		// 저장된 50이 있는지 확인하는 코드
		boolean isHere = false;
		if(list.contains(new Integer(50))) {
			isHere = true;
		}
		System.out.println(isHere ? "50이 있다." : "50이 없다.");
		
		// 7. 출력(컬렉션은 그냥 출력해도 된다.)
		System.out.println("list 전체 출력 : " + list);
		
		// 8. 초기화
		list.clear();
		System.out.println("초기화된 list 전체 출력 : " + list);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
