package test.t240701;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력받는다
		 * 합계와 평균 계산
		 * 합계와 평균을 이용하여 합격, 불합격 처리
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int c = sc.nextInt();
		
		int plus = a + b + c;
		double average = (double)plus/3; 
		
		System.out.println("국어 : " + a);
		System.out.println("영어 : " + b);
		System.out.println("수학 : " + c);
		System.out.println("합계 : " + plus);
		System.out.println("평균 : " + average);
		
		if( a >= 40 && b >= 40 && c >= 40 &&average >= 60){
			System.out.println("축하합니다 합격입니다");
		}else {
			System.out.println("아이구 불합격입니다");
		}
		
	}

}
