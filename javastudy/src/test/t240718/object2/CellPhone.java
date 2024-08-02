package test.t240718.object2;

public interface CellPhone extends Phone, Camera{
	//인터페이스는 다중상속 가능
	abstract String charge();
}
