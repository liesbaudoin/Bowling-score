package bowling.main;


import java.util.ArrayList;

/**
 * Created by Lies on 7-2-2017.
 */
public class BowlingTurn {
    private ArrayList<Integer> rolls = new ArrayList<Integer>();
    private int secondRoll = 0;

    public BowlingTurn roll(int pinsDown)
    {
        rolls.add(pinsDown);
        return this;
    }



    public int getFirstRoll() {
        return rolls.get(0);
    }

    public int getSecondRoll() {
        return rolls.get(1);
    }

    public boolean isSpare() {
        return getFirstRoll() + getSecondRoll() == 10;
    }

    public boolean isStrike() {
        return getFirstRoll() == 10;
    }
}



