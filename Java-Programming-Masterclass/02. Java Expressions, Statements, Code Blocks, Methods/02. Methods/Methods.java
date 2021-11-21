
public class Methods {

	public static void main(String[] args) {
		boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int totalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + totalScore);
        
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        totalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + totalScore);

	}
	
	public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

}
