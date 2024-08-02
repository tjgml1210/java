package test.t240704;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한 출력
		 * 관리자 : 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
		 * 회원 : 게시글 작성, 게시글 조회, 댓글작성
		 * 비회원 : 게시글 조회
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String user;
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		user = sc.next();
		/*
		if(user.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		}else if(user.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글작성");
		}else if(user.equals("비회원")) {
			System.out.println("게시글 조회");
		}
		*/
		
		switch(user) {
		
		case("관리자"): System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		break;
		case("회원"): System.out.println("게시글 작성, 게시글 조회, 댓글작성");
		break;
		case("비회원"): System.out.println("게시글 조회");
		break;
		}
		
		
		}

}
