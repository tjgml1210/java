package test.t240701;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		/*
		 * 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력한다.
		 * 입력한 수는 1보다 크거나 같아야 한다.
		 * 미만의 숫자가 입력됐다면 "1이상의 숫자를 입력해주세요"가 출력되면서
		 * 다시 사용자가 값을 입력하도록
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num > 0) {
			for( int i = 1 ; i <= num; i++) {
				System.out.print(i + " ");
			} 
			
		}else {
			System.out.print("1이상의 숫자를 입력해주세요.");
		}
	}
	
		
		
	}


