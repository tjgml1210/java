package test.t240705;

import java.util.Scanner;

public class T_05 {
	
	public static void main(String[] args) {
		/*
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		 * 저체중,정상체중,과체중,비만을 출력하세요
		 * BMI = 몸무게 / (키(m)*키(m))
		 * 18.5 미만 저체중/18.5이상 23미안 정상체중
		 * 23이상 25미만 과체중/25이상 30미만 비만
		 * 30이상 고도비만
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg) 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double BMI = kg / (height * height);
		System.out.print("BMI지수 : " + BMI + "\n");
		if(BMI <18.5) {
			System.out.println("저체중");
		}else if(BMI <23) {
			System.out.println("정상체중");
		}else if(BMI <25) {
			System.out.println("과채중");
		}else if(BMI <30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}
}
