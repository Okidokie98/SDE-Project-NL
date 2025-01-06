package Tic_Tac_Toe;

public abstract class PlayerFactory {
    public abstract Player createPlayer(char symbol);

    public static PlayerFactory getFactory(boolean isHuman) {
        return isHuman ? new HumanPlayerFactory() : new AIPlayerFactory();
    }
}