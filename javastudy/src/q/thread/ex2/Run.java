package q.thread.ex2;

public class Run {

	public static void main(String[] args) {
		Task t1 = new Task();
		Task2 t2 = new Task2();
		
		t2.start();
		t1.start();
	}

}