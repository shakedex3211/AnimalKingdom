import java.awt.*;
import java.util.*;

public class Tiger extends Critter {

    private int movesCounter;
    Color tigerColor;
    Random rand = new Random();

    public Tiger(){
        movesCounter = 0;//1,2,3
        getColor();
    }


    public Color getColor() {
        if ((movesCounter % 3) == 0){
            int x = 0;
            while (x == 0){
                int i = rand.nextInt(3); //0.Red 1.Green 2.Black
                if (i == 0 && this.tigerColor != Color.RED){
                    this.tigerColor = Color.RED;
                    x++;
                } if (i == 1 && tigerColor != Color.GREEN){
                    this.tigerColor = Color.GREEN;
                    x++;
                } if (i == 2 && tigerColor != Color.BLUE){
                    this.tigerColor = Color.BLUE;
                    x++;
                }
            }

        }
        return tigerColor;
    }

    public String toString() {
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        movesCounter++;
        if (info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL||info.getRight() == Neighbor.WALL){
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME){
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
