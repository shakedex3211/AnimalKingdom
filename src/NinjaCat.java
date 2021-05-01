import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class NinjaCat extends Critter{
    public boolean hasInfected;
    CatTypes type;

    public NinjaCat(){
        type = CatTypes.randomCatType();

    }

    public Color getColor() {
        switch (type){
            case NINJA:
                return Color.BLACK;
            case SAMORAI:
                return Color.GRAY;
            case GERMAN_HUNTER:
                return Color.RED;
            case NORWAY_VIKING:
                return Color.WHITE;
            case POLISH_RUNNER:
                return Color.CYAN;
        }
        return Color.RED;
    }

    public String toString() {
        switch (type){
            case NINJA:
                return "Katon!";
            case SAMORAI:
                return "HaYa!";
            case GERMAN_HUNTER:
                return "Hile";
            case NORWAY_VIKING:
                return "Skoll!";
            case POLISH_RUNNER:
                return "Ruuun!";
        }
        return "";
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER){
            hasInfected=true;
        }
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
