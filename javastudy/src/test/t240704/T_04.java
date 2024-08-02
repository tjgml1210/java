package test.t240704;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		System.out.print("숫자 : ");
		dan = sc.nextInt();
		
		
		if(dan < 9) {
		System.out.println(" ==== " + dan + "단 ==== ");
			for(int i = 1 ; i < 10 ; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i); }
		}else {
			System.out.println("9이하의 숫자만 입력해주세요");
		}

		
		
		}
}
