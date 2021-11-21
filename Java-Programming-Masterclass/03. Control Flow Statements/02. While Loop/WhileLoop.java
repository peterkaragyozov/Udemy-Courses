
public class WhileLoop {

	public static void main(String[] args) {
		int count = 0;
		while(count != 6) {
			System.out.println("Count value is " + count);
			count++;
		}
		
		count = 10;
		while(true) {
			if(count == 16) {
				break;
			}
			System.out.println("Count value is " + count);
			count++;
		}
		
		//Do While statement - it will always execute at least once.
		
		count = 100;
		do {
			System.out.println("Count value is " + count);
			count++;
			
			//we could add a condition like this
			if(count > 1000) {
				break;
			}
		} while (count != 106);
		
		
		//Mini challenge
		int number = 4;
		int finishNumber = 20;
		int evenNumbersFound = 0;
		
		while (number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			
			System.out.println("Even number " + number);
			evenNumbersFound++;
			if(evenNumbersFound >= 5) {
				break;
			}
			
		}
		
		System.out.println("Total even numbers found " + evenNumbersFound);

	}
	
	public static boolean isEvenNumber(int number) {
		if((number % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

}
