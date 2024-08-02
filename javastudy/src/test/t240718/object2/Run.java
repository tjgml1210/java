package test.t240718.object2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PhoneController객체생성
		PhoneController phController = new PhoneController();
		
		String[] results = phController.method();
		
		for(String res : results) {
			System.out.println(res);
			System.out.println();
		}
	}

}
