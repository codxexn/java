package day23_abstract;

abstract class Employee {
	// Field
	private String name;
	private String department;
	
	// Constructor
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	// Method
	abstract public int getPay();					// 하나라도 추상메소드가 있으면 추상클래스가 된다.
	
	public void emInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
	}
}

class SalaryWorker extends Employee {
	
	private int salary;
	
	public SalaryWorker(String name, String department, int salary) {
		super(name, department);
		this.salary = salary;
	}
	
	@Override
	public int getPay() {
		return salary;
	}
	
	@Override
	public void emInfo() {
		super.emInfo();
		System.out.println("기본급  : " + getPay() + "만원");
		System.out.println("----------------------------");
	}
}


class SalesWorker extends SalaryWorker {
	
	private int salesVolume;
	private double salesIncentive;
	
	public SalesWorker(String name, String department, int salary) {
		super(name, department, salary);
	}
	
	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		if(salesVolume < 500) setSalesIncentive(0.01);
		else if(salesVolume < 1000) setSalesIncentive(0.05);
		else setSalesIncentive(0.1);
	}
	
	public void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}
	
	public int getSalesPay() {
		return (int)(salesVolume * salesIncentive);
	}
	
	@Override
	public int getPay() {
		return super.getPay() + getSalesPay();
	}
	
	@Override
	public void emInfo() {
		System.out.println("판매수당 : " + getSalesPay() + "만원");
		super.emInfo();
	}
}

class PartTimeWorker extends Employee {
	private int workTime;
	private int payPerHour;
	
	public PartTimeWorker(String name, String department, int payPerHour) {
		super(name, department);
		this.payPerHour = payPerHour;
	}
	
	public void setWorkTime(int workTime) {
		if (workTime < 0) return;
		else if (workTime > 200) this.workTime = 200;
		else this.workTime = workTime;
	}
	
	@Override
	public int getPay() {
		return workTime * payPerHour;
	}
	
	@Override
	public void emInfo() {
		super.emInfo();
		System.out.println("월급 : " + getPay() + "만원");
		System.out.println("--------------------------");
	}
}

public class Ex03_Employee {
	public static void main(String[] args) {
		
		Employee[] em =	new Employee[3];
		
		em[0] = new SalaryWorker("제우스", "홍보부", 400);
		em[1] = new SalesWorker("포세이돈", "영업부", 100);
		em[2] = new PartTimeWorker("하데스", "판매부", 1);
		
		for (Employee staff : em) {
			if(staff instanceof SalesWorker) {
				((SalesWorker)staff).setSalesVolume(1000);
			} else if (staff instanceof PartTimeWorker) {
				((PartTimeWorker)staff).setWorkTime(200);
			}
			staff.emInfo();
		}
	}
}
