package project.ssh;

import java.util.ArrayList;
import java.util.List;

public class MovieController extends Movie{

	private Movie [] mList = new  Movie[7];
	private int i;

	public MovieController() {
		super();
		mList[0] = new Movie("핸섬가이즈", "나동협", "코미디");
		mList[1] = new Movie("탈주", "이종필", "액션");
		mList[2] = new Movie("데드풀과 울버린", "숀 레비", "액션");
		mList[3] = new Movie("인사이트 아웃 2", "켈시 맨", "애니메이션");
		mList[4] = new Movie("슈퍼배드 4", "크리스 리노드", "애니메이션");
		mList[5] = new Movie("하이재킹", "김성한", "범죄");
		mList[6] = new Movie("명탐정 코난", "나가오카치카", "만화");
	
	}
	
	public Movie[] selectAll() {
		return this.mList;
	}


	public Movie[] serchMovie(String keyword) {
		Movie[] tmpMovie = new Movie[7];
		
		int index = 0;
		for(int i = 0; i < mList.length; i++) {
			if(mList[i] == null);
			break;
		}
		String title = mList[i].getTitle();
		if(title.indexOf(keyword) != -1) {
			tmpMovie[index] = mList[i];
			index++;
		}
		return tmpMovie;
	}

	public int cart(int index) {
		int result = 0;
		Movie m = mList[index];
		if(m instanceof Movie) {
		
		}
		return 0;
	}
	
	
}
