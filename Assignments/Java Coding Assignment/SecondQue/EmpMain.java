package secondque;

public class EmpMain {
	public static void main(String[] args) {
		Employee emp1= new Employee(1,"Troye","New York");
		Employee emp2= new Employee(2,"Selena","Los Angeles");
		Employee emp3= new Employee(3,"Conan","Venice");
		Employee emp4= new Employee(4,"Shawn","Sydney");
		Employee emp5= new Employee(5,"Taylor","London");
		
		EmpAdd add = new EmpAdd();
		add.EmpAdd(emp1);
		add.EmpAdd(emp2);
		add.EmpAdd(emp3);
		add.EmpAdd(emp4);
		add.EmpAdd(emp5);
		
		for (Employee e: add.list)
		{
			System.out.println(e);
		}
		System.out.println("\n***********************************************************\n");
		System.out.println(add.getEmployee(4));
	}
}