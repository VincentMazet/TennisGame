package classes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vincent on 04/05/2017.
 */
public class TennisMatch {

    private Player playerOne;
    private Player playerTwo;
    private static MatchType matchType;
    private boolean isTieBreak;
    private static Map<TennisSet, Player> setsWinByPlayers = new HashMap<>();
    private static boolean isFinished;


    public TennisMatch(Player playerOne, Player playerTwo, MatchType matchType,  boolean isTieBreak){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.matchType = matchType;
        this.isTieBreak = isTieBreak;
    }

    public void updateWithPointWonBy(Player player){
        // TODO personne qui gagne le point
    }

    public String pointsForPlayer(Player player){
        // TODO retourne le score du joueur passé en argument dans le jeu en cours ("40", "15", "A" pour avantage)
        return null;
    }

    public int currentSetNumber(){
        // TODO
        return 0;
    }

    public int gamesInCurrentSetForPlayer(Player player){
        //TODO retourne le nombre de jeu gagné par le joueur passé en argument dans le set en cours
        return 0;
    }

    public int gamesInSetForPlayer(int setNumber,Player player){
        //TODO idem mais dans le set dont le numéro est passé en argument (le premier set est numéroté 1)
        return 0;
    }

    public boolean isFinished(){
        return this.isFinished;
    }

    public static void addSetToMatch(TennisSet set, Player player){
        setsWinByPlayers.put(set, player);

        int numberOfGameWinned = Collections.frequency(setsWinByPlayers.values(), player);

        if(numberOfGameWinned == matchType.numberOfSetsToWin()){
            isFinished = true;
        }
    }

    public Player getPlayerOne(){
        return this.playerOne;
    }

    public Player getPlayerTwo(){
        return this.playerTwo;
    }
}
