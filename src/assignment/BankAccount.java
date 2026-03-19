package assignment;

public class BankAccount {
	private int Balance =10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj= new BankAccount();
		obj.setter(20000);
		System.out.println(obj.getter());

	}
	public void setter(int balance) {
		Balance=balance;
	}
	public int getter() {
		return Balance;
	}
	
	
	

}
