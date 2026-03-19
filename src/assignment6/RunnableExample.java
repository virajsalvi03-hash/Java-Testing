package assignment6;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is method of runnable class");
				
			}
		};
		r.run();

	}

}
