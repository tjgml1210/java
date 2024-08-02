package test.t240709;

public class Run {
	public static void main(String[] args) {
		Member seohee = new Member();
		seohee.changeName("신서희");
		seohee.printName();
		
		//아이디, 비번, 이름을 초기화하는 생성자를 통해 객체를 하나 생성하고 printName()를 통해 이름을 출력해라
		Member seo = new Member("tjgml1210","tls021210","서히"); 
		seo.printName();
		
	}
}
