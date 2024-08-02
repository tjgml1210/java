package test.t240705;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		/*
		 * 실수형으로 국어,영어,수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		 * 이때 총점과 평균은 정수형으로 처리하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double a = sc.nextDouble();
		System.out.print("영어 : ");
		double b = sc.nextDouble();
		System.out.print("수학 : ");
		double c = sc.nextDouble();
		
		int plus = (int)(a + b + c);
		int average = (int)(plus /3);
		
		System.out.print("총점 : " + plus + "\n");
		System.out.print("평균 : " + average);

	}

}
