package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by vincent on 04/05/2017.
 */
public class Game {

    private Tuple<Player, Point> player1Point;
    private Tuple<Player, Point> player2Point;

    public Game(Player player1, Player player2){
       this.player1Point = new Tuple<>(player1, Point.ZERO_POINT);
       this.player2Point = new Tuple<>(player2, Point.ZERO_POINT);
    }

    public void newPoint(Player player) {
        if (player1Point.x.equals(player)) {
            addPointLogic(player1Point);
        } else if (player2Point.x.equals(player)){
            addPointLogic(player2Point);
         }else {
            throw new IllegalArgumentException(String.format("Player can't  be : %d", player.getName()));
        }
    }

    private void addPointLogic(Tuple<Player, Point> playerPoint){
        switch (playerPoint.y.getIdPoint()){
            case 0:
            case 1:
            case 2:
                if (player1Point.equals(playerPoint)) {
                    player1Point.y = playerPoint.y.addPoint(playerPoint.y);
                }else{
                    player2Point.y = playerPoint.y.addPoint(playerPoint.y);
                }
                break;
            case 3:
                if (player1Point.equals(playerPoint)) {
                    if(player2Point.y.equals(Point.FOURTH_POINT)){
                        player2Point.y = Point.THIRD_POINT;
                    }else {
                        player1Point.y = playerPoint.y.addPoint(playerPoint.y);
                    }
                } else if (player2Point.equals(playerPoint)){
                    if(player1Point.y.equals(Point.FOURTH_POINT)){
                        player1Point.y = Point.THIRD_POINT;
                    }else{
                        player1Point.y = playerPoint.y.addPoint(playerPoint.y);
                    }
                }else {
                    throw new IllegalArgumentException(String.format("Player can't  be : %d", playerPoint.x.getName()));
                }
                break;
            case 4:
                TennisSet.addGameToSet(this, playerPoint.x);
            break;

        }
    }
}