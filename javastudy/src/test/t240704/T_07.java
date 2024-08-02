package test.t240704;

import java.util.Scanner;

public class T_07 {

	public static void main(String[] args) {
		/*
		 * 문자열을 입력받아 문자 하나하나를 배열애 넣고 검색할 문자가 문자열에 몇개가 들어가있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String text = sc.next();
		
		System.out.print("문자 : ");
		char text2 = sc.next().charAt(0); //0번째 문자만 인식
		
		
		char[] chArr = new char[text.length()];
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = text.charAt(i);
		}
		int count = 0;
		System.out.print(text + "에 " + text2 + "가 존재하는 위치(인덱스) : " );
		for( int i = 0; i < chArr.length; i++) {
			if(text.charAt(i) == text2) {
				//문자열에서 가져온 n번째 문자와 입력받은 문자 비교
			System.out.print(i + " ");
			count ++;
			}
		} 
		System.out.println("\n" + text + "개수 : " + count);
		
		

	}

}
