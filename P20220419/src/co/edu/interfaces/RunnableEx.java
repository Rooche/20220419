package co.edu.interfaces;

//구현클래스 클래스명
interface Runnable {
	public void run();
}

class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println("움직입니다.");
	}

}

public class RunnableEx {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();

		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("멍멍가 달립니다.");
			} // 익명구현객체

		};
		runnable.run();

		// 익명구현객체
//		runnable = () -> {
//				System.out.println("야옹이가 달립니다.");
//		};
		// 멍멍이부터 위에 야옹이까지 다 사용가능하지만 이렇게 줄일수도 있음
		// 익명구현객체. 람다표현식(필요없는 부분을 삭제해서 간단하게 표현하는 방식)
		runnable = () -> System.out.println("야옹이가 달립니다.");

		runnable.run();
	}
}
