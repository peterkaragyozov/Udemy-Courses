
public class SwitchCase {

	public static void main(String[] args) {
		int value = 3;
		if (value == 1) {
			System.out.println("Value was 1");
		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Was not 1 or 2");
		}
		
		
		//Switch can be used with 4 primitive types - byte, short, char and int and with String
		
		int switchValue = 1;
		
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			default:
				System.out.println("Was not 1 or 2");
				break;
		}

	}

}
