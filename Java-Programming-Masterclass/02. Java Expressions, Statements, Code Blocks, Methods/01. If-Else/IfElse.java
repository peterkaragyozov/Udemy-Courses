
public class IfElse {

	public static void main(String[] args) {
		
		// If, Else if, Else 
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (score < 5000 && score > 1000) {
			System.out.println("Your score was less than 5000, but greater than 1000");
		} else if (score < 1000) {
			System.out.println("Your score was less than 1000");
		} else {
			System.out.println("Got here");
		}
	}

}
