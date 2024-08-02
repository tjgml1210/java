package test.t240705;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		/*
		 * A,B,C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		 * 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면"3000 미만"을 출력
		 * (A사원의 인센티브는 0.4,B사원의 인센은 없으며, C사원의 인센티브는 0.15)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		double totala,totalb,totalc;
		totala = a + (a *0.4); //*1.4
		totalb = b;
		totalc = c + (c *0.15);//*1.15
		
		System.out.printf("A사원 연봉/연봉+a : %d/%f\n", a,totala);
		System.out.println(totala >= 3000 ? "3000이상" : "3000미만");
		System.out.printf("B사원 연봉/연봉+a : %d/%f\n", b,totalb);
		System.out.println(totalb >= 3000 ? "3000이상" : "3000미만");
		System.out.printf("C사원 연봉/연봉+a : %d/%f\n", c,totalc);
		System.out.println(totalc >= 3000 ? "3000이상" : "3000미만");

	}

}
