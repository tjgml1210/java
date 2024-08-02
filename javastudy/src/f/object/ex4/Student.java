package f.object.ex4;

//이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 개체를 만들어라
//데이터는 직접 접근을 허용하지 ㅇ낳고 모두 간접적으로 set/get을 해줄 수 있도록 작성해라
//모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성

public class Student {
	
	//필드(데이터)
	private String name;
	private int age;
	private int Math;
	private int Eng;
	private int Kor;
	
	//생성자 영역/alt + shift + s -> o
	public Student() {}

	public Student(String name, int age, int math, int eng, int kor) {
		super();
		this.name = name;
		this.age = age;
		this.Math = math;
		this.Eng = eng;
		this.Kor = kor;
	}
	
	

	//메소드영역(기능)	
	//getter, setter //alt + shift + r -> o
	
	public String getName() {
		return this.name;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		if(Math <1) {
			this.Math = 1;
			return;
		}
		this.Math = Math;
	}

	public int getEng() {
		return Eng;
	}

	public void setEng(int eng) {
		if(Eng <1) {
			this.Eng = 1;
			return;
		}
		this.Eng = Eng;
	}

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		if(Kor <1) {
			this.Kor = 1;
			return;
		}
		this.Kor = Kor;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getEvg() {
		double evg = (this.Kor + this.Eng + this.Math) / 3.0;
			return evg;
		}
	
	public void pringEvg() {
		System.out.println(this.getName() + "님의 평균 : " + this.getEvg());
	}

	}