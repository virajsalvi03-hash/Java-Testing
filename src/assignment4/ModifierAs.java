package assignment4;

public class ModifierAs {
	public int sum =10;
	private int num=120;
	int def = 100;
	static int var;
	final int var2 = 4;
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifierAs obj = new ModifierAs();
//		System.out.println(obj.sum);
//		System.out.println(obj.num);
//		System.out.println(obj.def);
		var=2;
		
		System.out.println("Final : "+obj.var2+" Static : "+var);
		
//		String value ="This is Java Program";
//		String search ="is";
//		String[] Str = value.split(" "); // split will split array on given data 
//		int count=0;
//		for(String s:Str) {
//			if(s.equalsIgnoreCase(search)) {
//				count++;
//			}		
//		}
//		System.out.println(count);

	}

}
