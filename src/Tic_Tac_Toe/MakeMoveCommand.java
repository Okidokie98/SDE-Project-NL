package Tic_Tac_Toe;

public class MakeMoveCommand implements Command {
    private final Board board;
    private final int x, y;
    private final char symbol;

    public MakeMoveCommand(Board board, int x, int y, char symbol) {
        this.board = board;
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    @Override
    public void execute() {
        board.makeMove(x, y, symbol);
    }
}
