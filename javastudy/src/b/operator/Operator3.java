package b.operator;

public class Operator3 {
	/*
	 * 산술연산자
	 * + - * / %
	 * 
	 * * / % > + -
	 * 
	 * 복합 대입 연산자
	 * 산술연산자와 대입연산자를 결합해서 사용할 수 있다.
	 * 
	 * += /= -= *= %=
	 * 
	 * a = a + 3; -> a += 3;
	 */
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b; // c = 16
		int d = 16 / 6; // d = 2
		int e = c % a; //e = 4
		int f = e++; //f = 4
		int g = (--b) + (d--); //b = 9, d = 2(1), g = 11
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		// 6 + 9 / (15 / 4) * (11(10) - 1) % (6 + 2) = 6+9/3*10%8=12
		
		System.out.println(i);
		
	}
}
