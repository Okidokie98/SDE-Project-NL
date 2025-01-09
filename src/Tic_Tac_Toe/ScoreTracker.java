package Tic_Tac_Toe;

public class ScoreTracker {

    private static ScoreTracker instance; // De enige instantie van ScoreTracker

    private int playerScore;
    private int aiScore;

    // Privé constructor om instanties van buitenaf te blokkeren
    private ScoreTracker() {
        this.playerScore = 0;
        this.aiScore = 0;
    }

    // Publieke methode om de singleton instantie te krijgen
    public static ScoreTracker getInstance() {
        if (instance == null) {
            instance = new ScoreTracker();
        }
        return instance;
    }

    // Methode om de score van de speler te verhogen
    public void increasePlayerScore() {
        playerScore++;
    }

    // Methode om de score van de AI te verhogen
    public void increaseAIScore() {
        aiScore++;
    }

    // Methode om de huidige scores op te halen
    public String getScores() {
        return "Player Score: " + playerScore + " | AI Score: " + aiScore;
    }

    // Reset de scores voor een nieuwe game
    public void resetScores() {
        playerScore = 0;
        aiScore = 0;
    }
}