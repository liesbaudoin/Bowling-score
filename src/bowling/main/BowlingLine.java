package bowling.main;

import java.util.ArrayList;

/**
 * Created by Lies on 7-2-2017.
 */
public class BowlingLine {
    private ArrayList<BowlingTurn> scoreList = new ArrayList<BowlingTurn>();

    public BowlingTurn newTurn() {
        return new BowlingTurn();
    }

    public void addTurn(BowlingTurn turn) {
        scoreList.add(turn);
    }

    public int calculateScore() {
        int score = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            if (scoreList.get(i).isStrike()){
                score = score + 10 + scoreList.get(i+1).getFirstRoll() + scoreList.get(i+1).getSecondRoll();
            }
            else if (scoreList.get(i).isSpare()) {
                score = score + 10 + scoreList.get(i + 1).getFirstRoll();
            }

            else {
                score = score + scoreList.get(i).getFirstRoll() + scoreList.get(i).getSecondRoll();
            }
        }
        return score;
    }
}

