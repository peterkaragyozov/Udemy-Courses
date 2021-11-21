
public class ForLoop {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
		}
		
		System.out.println("********************************");
		
		//Reversed For loop		
		for(int i=15; i>=10; i--) {
			System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
		}

	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
