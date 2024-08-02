package test.t240704;


import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
		 * 만일 1미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		int num1,num2, max, min;
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		min = (num1 < num2) ? num1 : num2;
			
			if(num1 > 0 && num2 > 0) {
				for (int i = min ; i <= max ; i++) {
					System.out.print(i + " ");
				}
			}else{
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
		/*
		 if(num1 > num2) {
	         for(int i=num2; i<=num1; i++) {
	            System.out.print(i + " ");
	         }
	      }else if(num1 < num2) {
	         for(int i=num1; i<=num2; i++) {
	            System.out.print(i + " ");
	         }
	      }else if(num1 < 0 || num2 < 0) {
	         System.out.println("1 이상의 숫자를 입력해주세요.");
	      }
			*/
			
			
		}

}
