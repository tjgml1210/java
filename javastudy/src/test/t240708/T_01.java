package test.t240708;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		/*
		 * 키보드로 1개의 정수형 (int) 데이터를 입력받아
		 * 1~100 사이의 값일 때만 2의 배수인지 아닌지 출력 처리
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 100) {
			if(num % 2 ==0) {
				System.out.println("2의 배수 입니다.");
			}else {
				System.out.println("2의 배수가 아닙니다.");
			}
		}else {
			System.out.println("1 ~ 100사이의 숫자를 입력해주세요.");
		}
		
	}

}
