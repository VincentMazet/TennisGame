package classes;

/**
 * Created by vincent on 04/05/2017.
 */
public class TieBreakTennisGame implements TennisGame {

    private TennisMatch tennisMatch;

    @Override
    public Player chooseStartingPlayer() {
        return (Math.random() <= 0.5) ? tennisMatch.getPlayerOne() : tennisMatch.getPlayerTwo();
    }
}
