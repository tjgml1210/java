package d.loop;

import java.util.Scanner;

public class B_while {
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * [초기식;]
	 * while(조건식){
	 * 		반복할 코드
	 * 		증감식
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i < 5; i++) {
//			System.out.println("안녕하세요. ");
//	}
//		
		
		int i = 0;
	while(i < 5) {
		System.out.println("안녕하세요. ");
			i++;}
		
		//사용자가 0을 입력할 때까지 반복해서 숫자를 입력받아 그대로 출력해라
		/*
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}else {
				System.out.println(n);
			}
		}
		*/
		
		//1에서부터 10000사이의 홀수만을 출력
		//while문을 이용해서 하기
		/*
		int i = 1;
		
		while(i <= 10000) {
			System.out.print(i + " ");
			i+=2;
		}
		*/
		
		//1부터 랜덤값(1~100사이) 까지의 합계를 출력
		//1에서부터 ㅇㅇ까지의 총 합계 : ㅇㅇㅇㅇ
		
		/*
		int res = 0;
		int i = 1;
	
		int num = (int)(Math.random() *100) + 1 ;
		while( i <= num ) {
			res += i;
			i++;
		}
		System.out.print("1에서부터 " + num + "까지의 총 합계 :" + res);
		*/
		
		//사용자에게 문자열을 입력받아
		//해당 문자열의 짝수자리 글자만 출력
					
//		String text;
//		int i = 1;
//		System.out.print("문자열 입력 : ");
//		text = sc.next();
//		sc.nextLine();
//		
//		while(i < text.length()) {
//			System.out.print(text.charAt(i) + " ");
//			i+=2;
//		}
		
		
		
	}

}
