package sec02.example03;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {
	
	/*
	 * Supplier 함수적 인터페이스 (공급자)
	 * 
	 * 인터페이스명				추상 메소드
	 * Supplier<T>			T get()
	 * BooleanSupplier		boolean getAsBoolean()
	 * DoubleSupplier		double getAsDouble()
	 * IntSupplier			int getAsInt()
	 * LongSupplier			long getAsLong()
	 */

	public static void main(String[] args) {
		
		// Supplier<T> 함수적 인터페이스는 매개값이 없고, T타입의 값을 리턴을 해준다.(공급자)
		// 하여, 아래와 같이 함수적 인터페이스의 추상메서드인 get()을 람다식으로 제공을 해줬으며,
		// 또한 호출도 한 결과이다.
		Supplier<String> supplier = () -> {
			String str = "자바 공부를 합니다.";
			return str; 
		};
		String str = supplier.get();
		System.out.println(str);
		
		// IntSupplier 함수적 인터페이스 역시 매개값이 없고, int(고정)을 반드시 리턴을 해야한다.
		// getAsInt()를 람다식으로 구현해서 호출해본 결과이다.
		IntSupplier intSupplier = () -> {
			int rand = (int)(Math.random() * 45) + 1;
			return rand;
		};
		int rand = intSupplier.getAsInt();
		System.out.println("IntSupplier 함수적 인터페이스를 이용한 로또 번호 : " + rand);
	}

}
