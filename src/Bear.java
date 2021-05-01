import java.awt.*;

public class Bear extends Critter {

    private boolean polar;
    private int moves = 0;

    public Bear(boolean polar){
        this.polar=polar;
        getColor();
    }

    public int getMoves() {
        return moves;
    }

    public Color getColor(){
        if (this.polar){
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public Action getMove(CritterInfo info) {
        moves++;
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        } else {
            return super.getMove(info);
        }
    }

    public String toString() {
        if (moves%2==0){
            return "/";
        } else {
            return "\\";
        }
    }
}
