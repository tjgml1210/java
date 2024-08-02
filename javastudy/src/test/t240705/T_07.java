package test.t240705;

import java.util.Scanner;

public class T_07 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
		 * 만일 1미만의 숫자가 입력됐다면 "1이상의 숫자를 입력해주세요"를 출력되면서
		 * 다시 사용자가 값을 입력하도록 하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int min,max;
		min = (num1 < num2) ? num1 : num2;
		max = (num1 > num2) ? num1 : num2;
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		
		}else{
			for(int i = min ; i <=max; i++) {
				System.out.print(i + " ");
			}
			break;
		}
		
	}

}
}
