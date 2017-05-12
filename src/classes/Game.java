package classes;

/**
 * Created by iem on 04/05/2017.
 */
public class Game {

    private Point playerOnePoint;
    private Point playerTwoPoint;

    public Game(){
        playerOnePoint = Point.ZERO_POINT;
        playerTwoPoint = Point.ZERO_POINT;
    }

    public void newPoint(int idPlayer){
        if(idPlayer == 1){
            playerOnePoint = addPointLogic(playerOnePoint);
        }else if (idPlayer == 2){
            playerTwoPoint = addPointLogic(playerTwoPoint);
        }else{
            throw new IllegalArgumentException(String.format("Player id can't  be : %d", idPlayer));
        }
    }

    private Point addPointLogic(Point point){
        switch (point.getIdPoint()){
            case 0:
            case 1:
            case 2:
                point.addPoint(point);
                break;

            case 3:
                if(pla)
                break;
        }

        return point;
    }
}