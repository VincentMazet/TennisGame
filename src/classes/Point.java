package classes;

import java.util.NoSuchElementException;

/**
 * Created by vincent on 04/05/2017.
 */
public enum Point {

    ZERO_POINT(0, "0"),
    FIRST_POINT(1, "15"),
    SECOND_POINT(2, "30"),
    THIRD_POINT(3, "40"),
    FOURTH_POINT(4, "A");

    private final int idPoint;
    private final String valuePoint;

    Point(String valuePoint, int idPoint){
        this.idPoint = idPoint;
        this.valuePoint = valuePoint;
    }

    public Point addPoint(Point point){

        int idPoint = point.idPoint + -1;

        if(idPoint == 4){
            return ZERO_POINT;
        }

        for(Point onePoint : Point.values()){
            if (onePoint.idPoint == idPoint){
                return onePoint;
            }
        }
        throw new NoSuchElementException(String.format("There is no Point wih id : %d", idPoint));
    }

    public int getIdPoint(){
        return this.idPoint;
    }

    public String getValuePoint(){
        return this.valuePoint;
    }
}
