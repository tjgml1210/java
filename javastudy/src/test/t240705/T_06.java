package test.t240705;

import java.util.Scanner;

public class T_06 {

	public static void main(String[] args) {
		/*
		 * 중간고사,기말고사,과제점수,출석회수를 입력하고 Pass또는 Fail을 출력하세요.
		 * 평가 비율은 중간고사 20% /기말고사30%/과제 30%/출석 20%
		 * 이 때 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요
		 * 70점 이상일 경우 pass,70점 미만이거나 전체 강의에 30%이상 결석 시 fail을 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 : ");
		double middle = sc.nextDouble();
		middle *= 0.2;
		
		System.out.print("기말고사 점수 : ");
		double fin = sc.nextDouble();
		fin *= 0.3;
		
		System.out.print("과제 점수 : ");
		double rw = sc.nextDouble();
		rw *= 0.3;
		
		System.out.print("출석 회수 : ");
		double ct = sc.nextDouble(); //출석 비율은 총 강의 회수20회 중에서 출석한 날만 따진 값으로 계산하기때문에 곱할게 없음
		
		
		System.out.println("================결과==============");
		
		System.out.println("중간고사 점수(20) : " + middle);
		System.out.println("기말고사 점수(30) : " + fin);
		System.out.println("과제 점수 \t(30) : " + rw);
		System.out.println("출석 점수 \t(20) : " + ct);
		
		double total;
		total = middle+ fin+ rw+ ct;
		System.out.println("총점 : " + total);
		
		if(total >= 70 && ct >= (20 * 0.7)) {
			System.out.println("PASS");
		}else if(total < 70){
			System.out.println("FAIL[점수미달]");
		}else {
			System.out.println("FAIL[출석미달]");
		}

	}

}
