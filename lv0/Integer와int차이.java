package Programmers_Java.lv0;

public class Integer와int차이 {
	
//	Integer 와 int 차이
//
//	1. int는 기본 데이터 유형. Integer는 클래스.
//	int 변수는 메모리에 단순한 값 저장
//	반면 Integer 객체는 힙에 저장. 상속 및 다형성 등 객체 지향 기능 사용 가능
//
//	2. int 변수는 -2^31 ~ 2^31 사이의 정수 값 보유
//	반면 Integer 객체는 모든 정수 값 보유 가능
//
//	3. int 변수는 산술 연산에서 직접 사용 가능
//	반면 Integer 객체는 intValue() 메소드 사용하여 int 값으로 변환
//
//	4. Integer 객체는 valueOf(), parseInt(), toString()등 int 변수에 사용할 수 없는 추가 메서드 제공
//
//	Integer를 int로 변환하는 방법
//	int [] arr = Integer.stream().MaptoInt(Integer::intValue).toArray();
//
//	예제)
//	int a = 42;
//	int b = new Integer(42);
//	int c = b.intValue();
//
//	sysout a,b,c 하면 모두 42
//	그러나
//
//	a++ - 가능
//	b++ - 불가능 / b = b + 1은 오토박싱에 의해 가능
//	c++ - 가능
	
	
	
	public static void main(String[] args) {
		int a = 42;
		Integer b = new Integer(42);
		int c = b.intValue();

		System.out.println(a); // prints 42
		System.out.println(b); // prints 42
		System.out.println(c); // prints 42

		a++; // valid operation
		// b++; // invalid operation - Integer objects are immutable
		b = b + 1; // valid operation due to autoboxing
		c++; // valid operation

		System.out.println(a); // prints 43
		System.out.println(b); // prints 43
		System.out.println(c); // prints 43

		b = b.intValue() + 1;
		System.out.println("b1 : " + b);
		
//		

	}

}
