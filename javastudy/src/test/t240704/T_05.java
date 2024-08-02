package test.t240704;

public class T_05 {

	public static void main(String[] args) {
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		 * 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
		
		int arr[] = new int[10];
		
		for(int i= 0; i < arr.length;i++) {
			arr[i] = i + 1;
		}
		for(int i= 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이요하여 역순으로 배열 인덱스에 넣은 후
		 * 그 값을 출력하세요
		 */
		int arr2[] = new int[10];
		
		for (int j = (arr2.length -1) ; j >= 0; j--) {
			arr2[j] = j + 1;
		}
			for(int j= (arr2.length -1); j >= 0;j--) {
				System.out.print(arr2[j] + " ");
		}
			
			
		
	}

}
