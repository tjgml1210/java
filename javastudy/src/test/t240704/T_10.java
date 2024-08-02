package test.t240704;

public class T_10 {

	public static void main(String[] args) {
		/*
		 * 4행 4열 정수형 배열 선언 및 할당
		 * 16부터 1 값을 거꾸로 저장
		 * 출력
		 */
		
		
		int [][] arr =  new int[4][4];
		int value = 16;
		for(int i = 0; i<arr.length;i++) {
			for(int j=0 ; j < arr[i].length;j++) {
				arr[i][j] = value--;
			}
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println("");
		}
	}

}
