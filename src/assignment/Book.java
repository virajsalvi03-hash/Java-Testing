package assignment;

public class Book {
	String Att;
	double Price;
	Book(String att, double price) {
		this.Att=att;
		this.Price=price;
	}
	void display() {
		System.out.println("Your Book Name is : "+Att);
		System.out.println("Your Book price is : "+Price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book("Atomic Habits", 126.89);
		obj.display();
		
		

	}

}
