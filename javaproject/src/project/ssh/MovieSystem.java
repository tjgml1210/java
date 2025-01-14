package project.ssh;

import java.util.Scanner;

//영화 관심등록하기
//영화 검색 


public class MovieSystem extends Movie{

	private MemberController mc = new MemberController();
	private MovieController mv = new MovieController();
	private Scanner sc = new Scanner(System.in);
	private Member loggedInMember = null; // 로그인 상태를 저장할 필드
	
	
	public void mainMenu() {
		//메인메뉴
		while(true) {
			if(loggedInMember == null) {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 영화 목록 조회"); //1. 등록된 영화 전체 출력 2. 특정 영화 리뷰 검색
		System.out.println("9. 프로그램 종료");
			}else {
				System.out.println("1. 로그아웃");
				System.out.println("2. 마이페이지"); // 1. 회원 정보 수정 2. 내가 쓴 글
				System.out.println("3. 영화 전체 조회");
				System.out.println("4. 영화 관심 등록하기");
				System.out.println("9. 프로그램 종료");
			}
		System.out.print("번호 입력 : ");
		int choice = sc.nextInt();
		
		if(loggedInMember == null) {
		switch(choice) {
		case 1 : 
			this.login();
			break;
		case 2 :
			this.register();
			break;
		case 3 :
			this.printAllMovieReview();
			break;
		case 9 : 
			System.out.println("프로그램 종료");
			return;
		default :
			System.out.println("번호를 잘못 입력하셨습니다.");
			
		}
		}else {
			switch (choice) {
		case 1:
            this.logout();
            break;
        case 2:
            this.myPage();
            break;
        case 3:
        	this.selctAllMovie();
            break;
        case 4 :
        	this.cart();
        	break;
        case 9:
            System.out.println("프로그램 종료");
            return;
        default:
            System.out.println("번호를 잘못 입력하셨습니다.");
				}
			}
		}
	}
	
	public void login() {
		//로그인 기능
		   System.out.print("아이디 : ");
	        String id =sc.next();
	        System.out.print("비밀번호 : ");
	        String password = sc.next();

	        Member member = mc.login(id, password);
	        if (member != null) {
	        	loggedInMember = member;
	            System.out.println("로그인 성공! " + member.getName() + "님 환영합니다.");
	        } else {
	            System.out.println("로그인 실패. ID 또는 비밀번호를 확인해주세요.");
	        }
	}
	
	 public void logout() {
	        // 로그아웃 기능
	        loggedInMember = null;
	        System.out.println("로그아웃 되었습니다.");
	    }

	public void register() {
		String id;
		//회원가입기능
		while(true) {
			System.out.print("아이디 : ");
			id = sc.next();
			if(mc.checkId(id)) { //사용가능
				break;
			} else {//사용불가
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
		System.out.print("비밀번호 : ");
		String password = sc.next();
		while(true) {
			System.out.print("비밀번호 확인 : ");
			String password2 = sc.next();
			if(password2.equals(password)) {
				break;
			}else {
				System.out.println("비밀번호가 틀립니다 다시 입력해주세요.");
			}
		}
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("주민번호 앞자리(6자리) :");
		String joomin = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
	
		mc.register(id,password,name,joomin,email);
}
	
	public void myPage() {
		while(true) {
		System.out.println("1. 회원 정보 수정");
		System.out.println("2. 내 정보 보기");
		System.out.println("3. 내 관심내역 보기");
		System.out.println("9. 메인메뉴로 돌아가기");
		
		System.out.print("번호 입력 : ");
		int choice = sc.nextInt();
		

		switch(choice) {
		case 1 : 
			this.updateMember();
			break;
		case 2 :
			this.myInfo();
			break;
		case 3 :
			//내 관심내역 보기
		case 9 : 
			System.out.println("메인메뉴로 돌아갑니다.");
			this.mainMenu();
			break;
		default : 
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		}
	}
	
		
			public void updateMember() {
				
				System.out.println("1. 비밀번호 수정하기");
				System.out.println("2. 이름 수정하기");
				System.out.println("3. 이메일 수정하기");
				System.out.println("4. 생년월일 수정하기(주민등록번호 앞자리)");
				System.out.println("9. 메인으로 돌아기기");
				System.out.print("메뉴 번호 : ");
				int choice = sc.nextInt();
				sc.nextLine();
				
				switch(choice) {
				case 1:
					this.updatePassword();
					break;
				case 2:
					this.updateName();
					break;
				case 3:
					this.updateEmail();
					break;
				case 4 :
					this.updateJoomin();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
				
			}

			public void updatePassword() {
				String id, pwd;
			
				System.out.print("수정할 회원의 아이디 : ");
				id = sc.next();
				
				System.out.print("수정할 비밀번호 : ");
				pwd = sc.next();
				
				if(mc.updatePassword(id, pwd)) {
					System.out.println("수정이 성공적으로 되었습니다.");
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			}

			public void updateName() {
				String id, name;
				
				System.out.print("수정할 회원의 아이디 : ");
				id = sc.next();
				
				System.out.print("수정할 이름 : ");
				name = sc.next();
				
				if(mc.updateName(id, name)) {
					System.out.println("수정이 성공적으로 되었습니다.");
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			}

			public void updateEmail() {
				String id, email;
				
				System.out.print("수정할 회원의 아이디 : ");
				id = sc.next();
				
				System.out.print("수정할 이메일 : ");
				email = sc.next();
				
				if(mc.updateEmail(id, email)) {
					System.out.println("수정이 성공적으로 되었습니다.");
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			}

			public void updateJoomin() {
				String id, joomin;
				
				System.out.println("수정할 회원의 아이디 : ");
				id = sc.next();
				
				System.out.println("수정할 주민번호 앞자리 : ");
				joomin = sc.next();
				
				if(mc.updateEmail(id, joomin)) {
					System.out.println("수정이 성공적으로 되었습니다.");
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			}
		
	public void myInfo() {
		if (loggedInMember != null) {
            System.out.println("내 정보:");
            System.out.println("아이디 : " + loggedInMember.getId());
            System.out.println("비밀번호 : " + loggedInMember.getPassword());
            System.out.println("이름: " + loggedInMember.getName());
            System.out.println("주민번호: " + loggedInMember.getJoomin());
            System.out.println("이메일: " + loggedInMember.getEmail());
        } else {
            System.out.println("로그인 상태가 아닙니다.");
        }
	}
			
	
	public void selctAllMovie() {
		Movie[] mList = mv.selectAll();
		System.out.println("번호 \t 제목");
		System.out.println("=========================");
		this.printMovieList(mList);
		
		
	}
	
	public void printMovieList(Movie[] mList) {
		for(int i = 0; i <mList.length;i++) {
			if(mList[i] == null) {
				break;
			}
			
			System.out.println("(" + i + ") " + mList[i].getTitle() );
		}
	}
	
	public void cart() {
		this.selctAllMovie();
		System.out.println("관심 목록에 담을 번호 선택 : ");
		int index = sc.nextInt();
		int result = mv.cart(index);
		
	}
	public void printAllMovieReview() {
		//1. 등록된 영화 전체 출력 2. 특정 영화 리뷰 검색
		while(true) {
		System.out.println("1. 영화제목  전체 출력");
		System.out.println("2. 특정 영화 정보 검색");
		System.out.println("9. 메인메뉴로 돌아가기");
		
		System.out.print("번호 입력 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			this.selctAllMovie();
			break;
		case 2 :
			this.searchMovie();
			break;
		case 9 :
			System.out.println("메인메뉴로 돌아갑니다.");
			 return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		}
	}
	
	
	public void searchMovie() {
		System.out.print("검색할 영화 : ");
		String keyword = sc.next();
		Movie[] mList = mv.serchMovie(keyword);
		this.printMovieList1(mList);
	}

	public void printMovieList1(Movie[] mList) {
		for(int i = 0 ; i < mList.length ; i++) {
			if(mList[i] == null) {
				break;
			}
			System.out.println("(" + i + ") " + mList[i].toString());
		}
	}
	
	public void printMember() {
		Member [] mArr = mc.printMember();
		for(Member u : mArr) {
			if(u == null) {
				break;
			}
			
			System.out.println(u.toString());
		}
	}

}
