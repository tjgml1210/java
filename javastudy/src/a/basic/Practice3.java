package a.basic;
import java.util.Scanner;

public class Practice3 {
	/*
	 * 문자열 => 객체(기능들이 있다.)
	 * ex) 문자여비교시 -> 문자열.equals(비교문자열)
	 * 
	 * 문자열.charAt(index) :문자열에서 내가 원하는 index의 글자를 가져온다.
	 * index : 순서를 지칭할 때 사용하는 것
	 * 
	 * 영어 문자열 값을 키보드로 입력받아 단어의 앞에서부터 3개를 출력하세요.
	 * ex) apple -> app
	 * 
	 * 단어를 입력하세요 :
	 * 첫 번째 문자 : a
	 * 두 번째 문자 : p
	 * 세 번째 문자 : p
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================");
		String str1;
		
		
		System.out.print("단어를 입력하세요 : ");
		str1 = sc.nextLine();
		
		System.out.println("=======================================");
		System.out.println("첫번째 문자 : " + str1.charAt(0));
		System.out.println("두번째 문자 : " + str1.charAt(1));
		System.out.println("세번째 문자 : " + str1.charAt(2));
	
	}
}
