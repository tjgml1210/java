package d.loop;

public class E_continue {
	/*
	 * continue : 반복문 안에 기술되는 구문
	 * 				continue; 코드를 실행 시 그 뒤의 코드를 실행하지 않고 곧바로 다시 반복
	 */
	public static void main(String[] args) {
		//1부터 10까지 홀수 출력
		/*
		for(int  i=1; i <= 10; i++) {
			if(i % 2 ==0) {
				System.out.println(i + "  ");
			}
		}
		
		for(int i=1; i <=10; i++) {
			if(i%2 == 0) { //짝수라면 
				continue; //반복문의 나머지를 실행하지 않고 즉시 다음 반복문 진행
			}
			System.out.println(i + "  ");
		}
		*/
		
		//1부터 100까지의 총 합계
		//단 6의 배수값은 뺴고
		int res = 0;
		for(int i =1; i <= 100; i++) {
			if(i % 6 ==0) {
				continue;
			} 
			res += i;
			
		}
		System.out.print("6의 배수값을 제외한 1부터 100까지의 총 합계 : " + res);
		
		
		
		
	}

}
