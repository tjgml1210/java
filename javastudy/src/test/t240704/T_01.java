package test.t240704;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요
		 * 로그인 성공시"로그인 성공",
		 * 아이디가 틀렸을 시 "아이디가 틀렸습니다."
		 * 비밀번호 " "비밀번호가 ""를 출력
		 */
		Scanner sc = new Scanner(System.in);
		final String ID = "myId";
		final String PWD = "myPassword12";
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		//아이디 비밀번호 모두 맞은 경우
		if(id.equals(ID) && pw.equals(PWD)) {
			System.out.println("로그인 성공");
		}else if(id.equals(ID)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(pw.equals(PWD)) {
			System.out.println("아이디가 틀렸습니다.");
		}
	

	}

}
