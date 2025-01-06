package Tic_Tac_Toe;

public class AIPlayer implements Player {
    private final char symbol;

    public AIPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public void makeMove(Board board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.makeMove(i, j, symbol)) {
                    return;
                }
            }
        }
    }
}
