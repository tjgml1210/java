package test.t240705;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		/*
		 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요( - 포함) : ");
		String joomin = sc.next();
		char gender = joomin.charAt(7);
		
		switch(gender) {
		case '2','4' : System.out.println("여자");
		break;
		case '1','3' : System.out.println("남자");
		break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		

	}

}
