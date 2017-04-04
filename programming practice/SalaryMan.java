package programming;

public class SalaryMan {
	private int salary  = 1000000;
	
	public SalaryMan() {
		super();
	}
	
	public SalaryMan(int salary){
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		return (salary * 12) + (salary *5);
	}
	
	public static void main(String[] args){
		System.out.println("�⺻�� 100���� ���� : " + new SalaryMan().getAnnualGross());
		System.out.println("�⺻�� 200���� ���� : " + new SalaryMan(2000000).getAnnualGross());
	}
}
