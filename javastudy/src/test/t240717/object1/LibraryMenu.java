package test.t240717.object1;

import java.util.Scanner;

public class LibraryMenu {
	LibraryController lc;
	Scanner sc;
	
	public LibraryMenu() {
		super();
		this.lc = new LibraryController();
		this.sc = new Scanner(System.in);
	}
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		lc.insertMember(new Member(name,age,gender));
		
		while(true) {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			// LibraryController의 myInfo() 호출하여 출력
			Member m = lc.myinfo();
			System.out.println(m);
			break;
		case 2 :
			this.selectAll();
			break;
		case 3 :
			this.searchBook();
			break;
		case 4 :
			this.rentBook();
			break;
		case 9 :
			System.out.println("프로그램을 종료합니다.");
			return;
			default : 
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		this.printBookList(bList);
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] bookList = lc.serchBook(keyword);
		this.printBookList(bookList);

	}
	
	public void printBookList(Book[] bList) {
		for(int i = 0; i <bList.length;i++) {
			if(bList[i] == null) {
				break;
			}
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}
	}
	
	public void rentBook() {
		this.selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		switch(result) {
		case 0 :
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1 :
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2 :
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
		
	}
}
