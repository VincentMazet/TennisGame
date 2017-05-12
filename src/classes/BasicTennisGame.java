package classes;

/**
 * Created by iem on 04/05/2017.
 */
public class BasicTennisGame implements TennisGame {

    private TennisMatch tennisMatch;

    @Override
    public Player chooseStartingPlayer() {
        return (Math.random() <= 0.5) ? tennisMatch.getPlayerOne() : tennisMatch.getPlayerTwo();
    }
}
