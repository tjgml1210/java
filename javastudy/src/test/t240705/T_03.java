package test.t240705;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		/*
		 * 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		 */

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.printf("입력%d : ",i + 1);
			arr[i] = sc.nextInt();
		}
		
//		System.out.print("입력1 : ");
//		int a = sc.nextInt();
//		System.out.print("입력2 : ");
//		int b = sc.nextInt();
//		System.out.print("입력3 : ");
//		int c = sc.nextInt();
		//if(a==b && a==c)
		
		if(arr[0] == arr[1] && arr[0] == arr[2]) {
		System.out.println(arr[0] == arr[1] && arr[0] == arr[2]);
		//System.out.println(true);
		}else {
			System.out.println(arr[0] == arr[1] && arr[0] == arr[2]);
			//System.out.println(false);
		}
	}

}
