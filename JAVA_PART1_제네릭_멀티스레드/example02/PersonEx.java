package example02;

public class PersonEx {
	public static void main(String[] args) {

		// Person 제네릭 클래스에 T를 String만 들어오게끔 무조건 만들었다.
		Person<String> person1 = new Person<String>();
		person1.setT("홍길동");
		String str = person1.getT(); 
		System.out.println(str);
		
		// 현업에서 데이터의 통일화, 타입 변환 제거, 컴파일 시 예외 발생
		Person<Integer> person2 = new Person<>();
		// person2.setT(new Integer(100));
		person2.setT(100); // 자동 박싱
		int value = person2.getT(); // 자동 언박싱
		System.out.println(value);
		
		Person<Apple> person3 = new Person<>();
		person3.setT(new Apple()); // 자동 박싱
		Apple apple = person3.getT(); // 자동 언박싱
		System.out.println(apple);
		
	}
}
