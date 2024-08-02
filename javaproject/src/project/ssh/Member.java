package project.ssh;

public class Member{

	
	private String id;
	private String password;
	private String name;
	private String joomin;
	private String email;
	
	public Member() {
		super();
	}

	public Member( String id, String password, String name, String joomin, String email) {
		super();
	
		this.id = id;
		this.password = password;
		this.name = name;
		this.joomin = joomin;
		this.email = email;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoomin() {
		return joomin;
	}

	public void setJoomin(String joomin) {
		this.joomin = joomin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		return this.id + this.password + this.name + this.joomin + this.email;
	}



	
	
}
