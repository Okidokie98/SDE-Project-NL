package Tic_Tac_Toe;

public class TicTacToe {
    public static void main(String[] args) {
        Board board = new Board(3);
        PlayerFactory humanFactory = PlayerFactory.getFactory(true);
        PlayerFactory aiFactory = PlayerFactory.getFactory(false);

        Player player1 = humanFactory.createPlayer('X');
        Player player2 = aiFactory.createPlayer('O');

        GameController controller = new GameController();

        boolean gameRunning = true;

        while (gameRunning) {
            player1.makeMove(board);
            board.render();

            String status = board.checkGameStatus(player1.getSymbol());
            if (status.equals("win")) {
                board.render();
                System.out.println("Player '" + player1.getSymbol() + "' wins!");
                System.out.println("Jij bent echt goed! 🤯");
                gameRunning = false;
                continue;
            } else if (status.equals("draw")) {
                board.render();
                System.out.println("It's a draw!");
                gameRunning = false;
                continue;
            }

            System.out.println("⏭️⏭️⏭️⏭️⏭️");
            player2.makeMove(board);
            board.render();

            status = board.checkGameStatus(player2.getSymbol());
            if (status.equals("win")) {
                board.render();
                System.out.println("Player '" + player2.getSymbol() + "' wins!");
                System.out.println("Volgende keer beter! 😎");
                gameRunning = false;
            } else if (status.equals("draw")) {
                board.render();
                System.out.println("It's a draw!");
                gameRunning = false;
            }
        }
    }
}