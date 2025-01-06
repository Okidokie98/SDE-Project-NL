package Tic_Tac_Toe;

public class HumanPlayerFactory extends PlayerFactory {
    @Override
    public Player createPlayer(char symbol) {
        return new HumanPlayer(symbol);
    }
}