package test.t240711.object4;

public class StudentController {

	private Student[] sArr = new Student[5];
	
	public final int CUT_LINE = 60;

	public StudentController() {
		super();
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);
	}//초기화
	
	public Student[] printStudent() {
		return sArr; //객체 배열에 있는 데이터 반환
		}
	
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < sArr.length;i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = this.sumScore(); //0번째 인덱스의 모든 정수의 합
		avgArr[1] = this.sumScore() / sArr.length; //1번째 인덱스에 평균
		return avgArr;
	}
}