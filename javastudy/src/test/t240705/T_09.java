package test.t240705;

import java.util.Scanner;

public class T_09 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀수/짝수를 나눠서
		 * 홀수면 '박' 짝수면 '수를 출력하도록 하게요
		 * 단 입력받은 수가 양수가 아니면 "양수가 아닙니다"를 출력하세요
		 * 위 행위를 반복 -> 0을 입력할때 까지
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		do {
			System.out.print("\n정수 : ");
		 num = sc.nextInt();
			
			if(num > 0) {
					for(int i = 1; i <= num;i++) {
							System.out.print(i % 2 == 0 ? "수" : "박");
					}
			}else {
				System.out.println("양수가 아닙니다.");
			}
		}while(num != 0);
	}

}
