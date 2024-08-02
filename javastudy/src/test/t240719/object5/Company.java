package test.t240719.object5;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		
		employees [0] = new Secretary("Hilery",1,"secretary",800);
		employees [1] = new Sales("Clinten",2,"sales",1200);
		
		System.out.println("name   department   salary");
		System.out.println("===========================");
		
		for(Employee emlo : employees) {
			System.out.println(emlo.getName() + "   " + emlo.getDepartment() + "     " + emlo.getSalary());
		}
		
		System.out.println(" ");
		
		 // 모든 객체에 인센티브 100 씩 지급핚 급여를 계산하고 다시 객체의 salary에 넣는다 .  
        // 모든 객체의 정보와 세금을 출력핚다 (for 문을 이용하여 출력핚다.)
		System.out.println("인센티브 100 지급");
		System.out.println("name   department   salary   tax");
		System.out.println("=================================");

		((Secretary)employees[0]).incentive(100);
		((Sales)employees[1]).incentive(100);
		
		for(Employee emlo : employees) {
			System.out.println(emlo.getName() + "   " + emlo.getDepartment() + "   " + emlo.getSalary() + "   " + emlo.tax());
		}
	}

}
