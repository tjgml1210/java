package b.operator;

import java.util.Scanner;

public class Operater6 {
	/*
	 * 삼항연산자
	 * [표현식]
	 * 조건식 ? 조건식이 참일경우 결과값 : 조건식이 거짓일 경우 결과값
	 * 
	 * 이때, 조건식은 반드시 true 또는 false가 나오는 논리값이어야한다.
	 * 주로 비교, 논리연산자를 통해서 작성
	 */
	public static void main(String[] args) {
//		int num = (3 < 10) ? 10 : 20; //참 = 10출력
//		System.out.println(num);
//		int num2 = (3 > 10) ? 10 : 20; //거짓 = 20출력
//		System.out.println(num2);
		
		//입력받은 정수값이 양수인지 아닌지 판별 후 출력해라
		//정수값 입력 :
		//양수/음수
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		System.out.print("정수 하나 입력 :");
		num1 = sc.nextInt();
		
	    String str = (0 < num1) ? "양수" : "음수";
	    System.out.println(str);
//		System.out.println((0 < num1) ? "양수" : "음수");
		
//	    //if문(조건문)
//		if(num1 > 0) {
//			str = "양수";
//		} else if(num1 == 0) {
//			str = "0이다";
//		} else {
//			str ="음수";
//		}
//	System.out.println(str);	
	
	
	}
	}


