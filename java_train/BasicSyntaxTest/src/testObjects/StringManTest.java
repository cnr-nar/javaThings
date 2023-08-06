package testObjects;

public class StringManTest {

	public static void main(String[] args) {
		String test = "Test";
		
//		boolean res = test.equals("t"); 		// either eq or not
//		int res = test.length();				// lenght of string
//		char res = test.charAt(0);				// get the char at index
//		int res = test.indexOf("T");			// get the index of given char at string
//		boolean res = test.isEmpty();			// is string empty or not
//		String res = test.toUpperCase();
//		String res = test.toLowerCase();
//		String res = test.trim(); 				// Gets rid of white spaces of string
		String res = test.replace('e', 'a');	//replaces chars
		
		System.out.println(res);

	}

}
