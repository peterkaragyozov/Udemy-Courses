
public class CharAndBoolean {

	public static void main(String[] args) {
		
		//char stores only 1 character
		char myChar = 'D';
		char myUnicodeChar = '\u0044';
		
		System.out.println(myChar);
		System.out.println(myUnicodeChar);
		
		// boolean		
		boolean isCustomerOverEighteen = true;
		
		// String is not a primitive type, but a special class
		String myString = "This is a string";
		System.out.println(myString);
		
		// When we add int to a String, Java converts it to a String as well. Same happens with double.
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString);
		
	}

}
