package e.array;

public class C_Array_two {
	/*
	 * 2차원 배열
	 * 자료형이 같은 1차원 배열의 묶음으로 배열안에 다른 배열이 존재한다.
	 * 2차원 배열은 할당된 공간마다 인덱스번호를 두개 부여
	 * (앞번호는 몇번째 1차원 배열인지(행), 뒷번호는 1차원 배열의 몇번째 index인지(열))
	 */
	public static void main(String[] args) {
		/*
		 * 1. 2차원 배열선언(1차원 배열의 묶음을 참조하는 2차원 배열 참조변수를 만든다)
		 * 자료형[][]배열명;
		 */
		
//		int[][] arr;
		
		/*
		 *2. 배열할당(실제 m크기의 1차원배열 n개를 만들어서 참조)
		 *배열명 = new 자료형[n][];
		 *배열명[0] = new 자료형[m];
		 *배열명[1] = new 자료형[m];
		 *배열명[n] = new 자료형[m];
		 */
		//arr = new int[3][4]; //4짜리 1차원배열 3개묶음 생성
//		arr = new int[3][]; //1차원배열 3개묶음 생성
//		arr[0] = new int[4];
//		arr[1] = new int[4];
//		arr[2] = new int[4];
		
		/* 배열 선언과 동시에 할당
		int[][] arr = new int[3][4];
		
		//3. 배열의 값 대입
		//배열명[배열순번][인덱스] = 값;
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[2][3] = 3;
		*/
		
		// 3행 3열짜리 문자열 배열은 선언하고 0행 0열부터 2행 2열까지 차례대로 접근하여(행, 열)값을 저장하기

		String [][] arr =  new String[3][3];
		/*		
		for(int i = 0; i< arr[0].length; i++) {
		arr [0][i] = "(0행 " + i + "열)";
//		arr [0][0] = "(0행 0열)";
//		arr [0][1] = "(0행 1열)";
//		arr [0][2] = "(0행 2열)";
		}
		
		for(int i = 0; i< arr[0].length; i++) {
		arr [1][i] = "(1행 " + i + "열)";
//		arr [1][0] = "(1행 0열)";
//		arr [1][1] = "(1행 1열)";
//		arr [1][2] = "(1행 2열)";
		}
		
		for(int i = 0; i< arr[0].length; i++) {
		arr [2][i] = "(2행 " + i + "열)";
//		arr [2][1] = "(2행 0열)";
//		arr [2][1] = "(2행 1열)";
//		arr [2][2] = "(2행 2열)";
		}
*/
		for(int j=0; j< arr.length; j++) {
			for(int i=0; i<arr[j].length; i++) {			
				arr[j][i] = "(" + j + "행 " + i + "열)";
			}
		}
		
		//2차원배열 arr의 모든 값을 출력해라
		for(int j=0; j < arr.length; j++) {
			for(int i=0; i<arr[j].length;i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
	}

}
