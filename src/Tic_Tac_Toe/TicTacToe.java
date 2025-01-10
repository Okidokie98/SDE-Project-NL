package Tic_Tac_Toe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        ScoreTracker scoreTracker = ScoreTracker.getInstance();

        Board board = new Board(3);
        PlayerFactory humanFactory = PlayerFactory.getFactory(true);
        PlayerFactory aiFactory = PlayerFactory.getFactory(false);

        Player player1 = humanFactory.createPlayer('X');
        Player player2 = aiFactory.createPlayer('O');

        GameController controller = new GameController();


        while (gameRunning) {
            player1.makeMove(board);
            board.render();

            String status = board.checkGameStatus(player1.getSymbol());
            if (status.equals("win")) {
                scoreTracker.increasePlayerScore();
                board.render();
                System.out.println("Speler '" + player1.getSymbol() + "' wint!");
                System.out.println("Jij bent echt goed! 🤯");
                System.out.println(scoreTracker.getScores());

                System.out.print("Wil je nog een keer spelen? (Y/N): ");
                String input = scanner.nextLine().trim().toUpperCase();
                if (input.equals("N")) {
                    gameRunning = false; // Stop de loop
                    System.out.println("Bedankt voor het spelen!");
                }
                board = new Board(3); // Reset the board
                continue;
            } else if (status.equals("draw")) {
                board.render();
                System.out.println("Het is gelijkspel!");
                System.out.println(scoreTracker.getScores());
                System.out.print("Wil je nog een keer spelen? (Y/N): ");
                String input = scanner.nextLine().trim().toUpperCase();
                if (input.equals("N")) {
                    gameRunning = false; // Stop de loop
                    System.out.println("Bedankt voor het spelen!");
                }
                board = new Board(3); // Reset the board
                continue;
            }

            System.out.println("⏭️⏭️⏭️⏭️⏭️");
            player2.makeMove(board);
            board.render();

            status = board.checkGameStatus(player2.getSymbol());
            if (status.equals("win")) {
                scoreTracker.increaseAIScore();
                board.render();
                System.out.println("Speler '" + player2.getSymbol() + "' wint!");
                System.out.println("Jij bent echt goed! 🤯");
                System.out.println(scoreTracker.getScores());

                System.out.print("Wil je nog een keer spelen? (Y/N): ");
                String input = scanner.nextLine().trim().toUpperCase();
                if (input.equals("N")) {
                    gameRunning = false; // Stop de loop
                    System.out.println("Bedankt voor het spelen!");
                }
                board = new Board(3); // Reset the board
                continue;
            } else if (status.equals("draw")) {
                board.render();
                System.out.println("Het is gelijkspel!");
                System.out.println(scoreTracker.getScores());
                System.out.print("Wil je nog een keer spelen? (Y/N): ");
                String input = scanner.nextLine().trim().toUpperCase();
                if (input.equals("N")) {
                    gameRunning = false; // Stop de loop
                    System.out.println("Bedankt voor het spelen!");
                }
                board = new Board(3); // Reset the board
                continue;
            }
        }
    }
}