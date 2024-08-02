package a.basic;
import java.util.Scanner;

public class Practice2 {
/*
 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요.
 * 면적 : 가로 * 세로
 * 둘레 : (가로 + 세로) * 2
 * 
 * ==결과==
 * 가로 :
 * 세로 : 
 * 
 * 면적 :
 * 둘레 :
 */
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================");
		double num1, num2;
		
		
		System.out.print("사각형의 가로길이 : ");
		num1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("사각형의 세로길이 : ");
		num2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("=======================================");
		
		System.out.printf("면적 : %.2f\n" , (num1 * num2));
		System.out.printf("둘레 : %.2f" , ((num1 + num2) * 2));
		
	}

}
