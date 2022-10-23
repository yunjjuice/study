package sec02.example04;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class FunctionEx02 {

	public static ArrayList<Student> arrayList = new ArrayList<Student>(); 
	
	public static void main(String[] args) {

		arrayList.add(new Student("홍길동", "대구", 100, 80));
		arrayList.add(new Student("신은혁", "서울", 90, 88));
		arrayList.add(new Student("김연아", "광주", 77, 100));
		
		// 실행블럭에서 어떤 메서드를 호출하느냐에 따라 점수가 달라짐을 확인할 수 있어야 한다. (영어)
		ToIntFunction<Student> toIntFunction1 = t -> { return t.getEnglishScore(); };
		// 매개값으로 applyAsInt() 추상 메서드의 실체 람다식을 정의한 toIntFunction1 전달하고 있다.
		average(toIntFunction1, "영어");

		// 수학
		ToIntFunction<Student> toIntFunction2 = t -> { return t.getMathScore(); };
		average(toIntFunction2, "수학");
	}
	
	// average()에서 매개변수타입이 ToIntFunction<Student>를 구현한 객체가 넘어와야 함.
	public static void average(ToIntFunction<Student> function, String str) {
		
		int sum = 0;
		double avg = 0.0;
		
		for (Student student : arrayList) {
			int score = function.applyAsInt(student);
			sum += score;
		}
		
		avg = (double) sum / arrayList.size();
		System.out.println(str + "점수 평균 : " + avg + "\t");
	}
}
