package test.t240705;

import java.util.Scanner;

public class T_10 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 문자열을 입력받고 문자열에서 검색될 문자를 입력받아 해당 문자열에 그 문자가 몇 개 있는지 
		 * 개수를 출력하세요
		 *"더 하시겠습니까?"라고 추가로 물어보도록 하세요
		 * 이때 N이나n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되, YyNn이 아닌 다른 문자를
		 * 입력했을 경우 " 잘못된 대답입니다. 다시입력해주세요"를 출력하고
		 * 더 하겠냔느 물음을 반복하세요
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("문자열 : ");
		String text = sc.next();
		
		System.out.print("문자 : ");
		char text2 = sc.next().charAt(0); //0번째 문자만 인식
		
		
		char[] chArr = new char[text.length()];
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = text.charAt(i);
		}
		int count = 0;
		for( int i = 0; i < chArr.length; i++) {
			if(text.charAt(i) == text2) {	
			count ++;
			}
		} 
		System.out.println("포함된 개수 : " + count);
		//y / n을 제대로 입력했는지 검사해서 아닐 시 다시 입력받는다.
		while(true) {
		System.out.print("더 하시겠습니까?(y/n) : ");
		
		text2 = sc.next().charAt(0);
		if(!(text2 == 'n' || text2 =='N' || text2 =='y' || text2=='Y')) { //!= && 사용도 가능
		System.out.println("잘못입력했습니다. 다시 입력해주세요.");
		}else {
			break;
			}
		}
		if(text2 =='n' ||text2 == 'N') {
			break;
			}
		}
		
	}

}
