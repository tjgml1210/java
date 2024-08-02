package g.object_static;

public class Run {

	/*
		static 이란 '정적인', '고정적인'이라는 의미를 가진다.
		static 변수와 static 메소드는 정적메모리를 사용하며 프로글매 실행시점에 따로 객체생성없이
		메모리가 생성되며 이는 모든 객체가 공유하여 사용한다.
		클래스(static)변수 -> 한 클래스에서 공통적인 값을 유지해야할 때 사용
				   클래스이름.변수명 으로 호출이 가능하며 참조변수를 통해서 호출할 수도 있다. 
		클래스(static)메소드 -> 인스턴스 변수를 사용할 수 없으므로 인스턴스와 관계없는 메소드를 클래스 메소드로 사용한다.
							클래스이름.메소드명으로 호출이 가능하다.
	 */
	public static void main(String[] args) {
		Human s = new Human("신서희",23);
		s.inform();
		
		Human h = new Human("김가영",23);
		h.inform();
		
		Human k = new Human("김혜승",23);
		k.inform();
		
		System.out.println("====================");
		System.out.println("총 방문 고객은 : " + Human.count);
		
		

	}

}
