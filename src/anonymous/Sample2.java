package anonymous;
abstract class Body{
	abstract void hand();
}
public class Sample2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Body b= new Body() {
			
			@Override
			void hand() {
				System.out.println("This is Anonymous class method");
				
			}
		};
		b.hand();
		
		
		

	}

}
