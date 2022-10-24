package sec02.example07;

import java.util.function.Consumer;

public class ConsumerAndThenEx {

	public static void main(String[] args) {
		
		// Consumer<T> 함수적 인터페이스는 매개값 p를 받아와서 단순히 소비하는 역할만 한다.
		// 하여, 아래와 같이 accept() 추상메서드를 람다식으로 정의했다.
		Consumer<People> consumerA = p -> {
			System.out.println("ConsumerA : " + p.getName());
		};

		Consumer<People> consumerB = p -> {
			System.out.println("ConsumerB : " + p.getId());
		};
		
		// 위의 정의된 2개의 함수적 인터페이스 consumerA와 consumerB를 가지고 아래와 같이 코딩을 하면,
		// consumerA가 먼저 실행되고, 이어서 consumerB가 실행되어 출력결과가 나온다.
		Consumer<People> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new People("신은혁", "Shin", null));
	}

}
