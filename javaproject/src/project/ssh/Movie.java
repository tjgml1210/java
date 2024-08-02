package project.ssh;

public class Movie {
	private String title;
	private String director;
	private String kind;
	
	
	public Movie() {
		super();
	}


	public Movie(String title, String director, String kind) {
		super();
		this.title = title;
		this.director = director;
		this.kind = kind;
	}



	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}


	
	@Override
	public String toString() {
		
		return title + "\t" +   director+  "\t" + kind ;
	}



	

	
	
}
