package Tic_Tac_Toe;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final char symbol;
    private final Scanner scanner = new Scanner(System.in);

    public HumanPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public void makeMove(Board board) {
        System.out.println("Vul je rij (®️) en kolom (©️) in: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (!board.makeMove(x, y, symbol)) {
            System.out.println("Foute zet. Probeer opnieuw. 🔁");
            makeMove(board);
        }
    }
}
