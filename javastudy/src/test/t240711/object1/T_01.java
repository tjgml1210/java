package test.t240711.object1;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		//정수 n(2~9)를 입력받아 2부터 n까지 중 짝수의 구구단을 출력하는 코드를 작성하세요
		//만약 2~9사이의 값을 입력하지 않는다면 다시 입력하세요를 반복합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		while(true) {
		int n = sc.nextInt();
		
		if(!(n >=2 && n<=9)) {
			System.out.println("다시 입력하세요.");
			continue;
		}
		
	
		for(int i = 2 ; i <= n ; i++) {
			if(i % 2 == 0) {
			for(int j=1 ; j <10 ;j++) {
					System.out.println(i + " * " +j + " = " + (i*j));
				}
			}
		}break;
	}
}
}
