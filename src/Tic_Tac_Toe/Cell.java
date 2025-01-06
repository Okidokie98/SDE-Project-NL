package Tic_Tac_Toe;

public class Cell implements BoardComponent {
    private char symbol = ' ';

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public void render() {
        System.out.print(symbol == ' ' ? "_" : symbol);
    }

    @Override
    public boolean isEmpty() {
        return symbol == ' ';
    }
}