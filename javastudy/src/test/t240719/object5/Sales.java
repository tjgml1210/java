package test.t240719.object5;

public class Sales extends Employee implements Bonus{

	
	public Sales() {
		super();
	}

	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}


	@Override
	public void incentive(int pay) {
		super.setSalary((int)(super.getSalary() + (pay *1.2)));
		
	}

	@Override
	public double tax() {
		return super.getSalary() * 0.13;
	}

}
