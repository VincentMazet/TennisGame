package classes;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vincent on 12/05/2017.
 */
public class TennisSet {

    private static Map<Game, Player> gameWinByPlayers = new HashMap<>();

    public TennisSet(){
    }

    public static void addGameToSet(Game game, Player player){
        gameWinByPlayers.put(game, player);

        int numberOfGameWinned = Collections.frequency(gameWinByPlayers.values(), player);

        if(numberOfGameWinned >= 6){

        }
    }
}
