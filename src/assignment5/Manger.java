package assignment5;

public class Manger extends Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manger obj = new Manger();
		obj.salarycal();
	
	}
	@Override
	void salarycal() {
		double bonus=5000;
		salary = salary+bonus;
		System.out.println(salary);
	}

}
