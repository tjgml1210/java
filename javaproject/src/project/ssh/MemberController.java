package project.ssh;

public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 50;
	
	 public Member login(String id, String password) {
	        for (Member member : m) {
	            if (member != null && member.getId().equals(id) && member.getPassword().equals(password)) {
	                return member;
	            }
	        }
	        return null;
	    }
	
	
	public void register(String id, String password, String name, String joomin, String email) {
		//회원가입 기능
		for(int i = 0 ; i < m.length ; i++) {
			if(m[i] == null) { 
				m[i] = new Member(id, password, name, joomin,email);
				break;
			}
			
		}
	}
	
	public boolean checkId(String inputId) {
		for(int i=0; i < m.length; i++) {
			if(m[i] == null) {
				return true;
			}
			
			String userId = m[i].getId();
			if(userId.equals(inputId)) {// 중복id찾음
				return false;// 사용불가
			}
		}
		
		return true; // 사용가능
	}
	
	public boolean checkPW(String inputPassword) {
		for(int i = 0 ; i < m.length ; i++) {
			if(m[i] == null) {
				return true;
			}
			String userPassword = m[i].getPassword();
			if(userPassword.equals(inputPassword)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean updatePassword(String id, String password) {
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}

	public boolean updateName(String id, String name) {
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}

	public boolean updateEmail(String id, String email) {
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateJoomin(String id, String joomin) {
		for(int i = 0 ; i < m.length ; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setJoomin(joomin);
				return true;
			}
		}
		return false;
	}
	
	public Member[] printMember() {
		return this.m;
	}
	
	
}
