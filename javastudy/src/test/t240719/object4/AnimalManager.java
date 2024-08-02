package test.t240719.object4;

public class AnimalManager{

	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성 
		Animal [] aniArr = new Animal[5];
		
		  // 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성) 
		aniArr[0] = new Cat("가용이","검은고양이","노블레스","검은색");
		aniArr[1] = new Dog("지은이","비숑",1);
		aniArr[2] = new Cat("헤승이","하얀고양이","남대","핑크색");
		aniArr[3] = new Dog("서히","사람",3);
		aniArr[4] = new Dog("꿈이","말티즈",5);
	
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의  
		// 객체의 speak() 메소드 호출 
//		for(int i = 0; i < aniArr.length ; i++) {
//			aniArr[i].speak();
//		}
		for(Animal ani : aniArr) {
			ani.speak();
		}
		

	}

}
