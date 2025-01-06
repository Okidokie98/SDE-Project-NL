package Tic_Tac_Toe;

public class AIPlayerFactory extends PlayerFactory {
    @Override
    public Player createPlayer(char symbol) {
        return new AIPlayer(symbol);
    }
}
