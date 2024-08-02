package test.t240715.object3;

import java.util.Scanner;

public class PointMenu {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	
	public void mainMenu() {
		int choice = 0;
		while(choice != 9) {
			
		System.out.println(" ===== 메뉴 ===== ");
		System.out.println("1. 원"); //circleMenu() 
		System.out.println("2. 사각형"); //rectangleMenu() 
		System.out.println("9. 끝내기");
		System.out.print("메뉴번호 : ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 : 
			this.circleMenu();
			break;
		case 2 : 
			this.rectangleMenu();
			break;
		case 9 : 
			System.out.println("종료합니다.");
			break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void circleMenu() {
		
		System.out.println(" ==== 원 메뉴 ==== ");
		System.out.println("1. 원 둘레"); // calcCircum()
		System.out.println("2. 원 넓이"); // calcCircleArea()
		System.out.println("9. 메인으로");
		System.out.print("메뉴번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			this.calcCircum();
			break;
		case 2:
			this.calcCircleArea();
			break;
		case 9 :
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		
		}
	}
	
	public void rectangleMenu() {
		while(true) {
		System.out.println(" ===== 메뉴 ===== ");
		System.out.println("1. 사각형 둘레"); // calcPerimeter() 
		System.out.println("2. 사각형 넓이"); // calcRectArea()
		System.out.println("9. 메인으로");
		System.out.print("메뉴번호 : ");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1:
			this.calcPerimeter();
			break;
		case 2:
			this.calcRectArea();
			break;
		case 9 :
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		
		}
	}
	}
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력 
		System.out.println(cc.calcCircum(x, y, radius));
		
		
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		// 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력  
		System.out.println(cc.calcArea(x, y, radius));
		
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		// 데이터를 RectangleController(rc) calcArea()의 매개변수로 보내 반환값 출력  
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
