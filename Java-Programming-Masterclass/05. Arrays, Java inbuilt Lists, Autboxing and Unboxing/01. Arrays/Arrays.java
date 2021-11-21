
public class Arrays {

	public static void main(String[] args) {
		int[] myIntArray = new int[5];
		myIntArray[3] = 50;
		
		int [] myOtherIntArray = {10, 20, 30, 40, 50};
		
		printArray(myIntArray);
		System.out.println("My other int array values: ");
		printArray(myOtherIntArray);	
		}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
