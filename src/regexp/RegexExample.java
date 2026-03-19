package regexp;

import java.util.regex.*;

public class RegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = "This is python Progrmaming language ";
		Pattern pat = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher mat = pat.matcher(val);
		boolean found = mat.find();
		if(found) {
			System.out.println("Java word is present");
		}else {
			System.out.println("Java word is not Present");
		}
		

	}

}
