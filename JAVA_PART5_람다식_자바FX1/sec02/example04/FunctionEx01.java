package sec02.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx01 {

	// Arrays 클래스의 asList()는 매개값으로 들어오는 객체를 딱 고정된 값들로 해서 List<T>으로 리턴한다.
	private static List<Student> list = Arrays.asList(
			new Student("신은혁", "대구", 100, 95),
			new Student("김연아", "광주", 90, 98),
			new Student("차주혁", "서울", 80, 92),
			new Student("신주아", "부산", 81, 99)
	); 
	
	public static void main(String[] args) {
		
		Function<Student, String> function = t -> { return t.getName(); };
		printString(function);
		
		ToIntFunction<Student> toIntFunction = t -> { return t.getEnglishScore(); };
		intPrint(toIntFunction, "영어");

		ToIntFunction<Student> toIntFunction2 = t -> { return t.getMathScore(); };
		intPrint(toIntFunction2, "수학");
		
	}
	
	// Function<T, R> 함수적 인터페이스는 T를 매개값으로 하여, R로 매핑하여 리턴하는 인터페이스이다.
	// 여기서는 곧 printString의 매개변수 타입이 Function<T, R> 함수적 인터페이스이다.
	// 그 말은 곧, Function<T, R> 함수적 인터페이스를 구현한 람다식이 넘겨주어야 한다.
	public static void printString(Function<Student, String> function) {
		
		for (Student student : list) {
			String str = function.apply(student);
			System.out.print("이름 : " + str + "\t");
		}
		System.out.println();
	}

	public static void intPrint(ToIntFunction<Student> function, String str) {
		
		for (Student student : list) {
			int score = function.applyAsInt(student);
			System.out.print(str + "점수 : " + score + "\t");
		}
		System.out.println();
	}

}
