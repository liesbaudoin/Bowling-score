package bowling.test;

/**
 * Created by Lies on 18-2-2017.
 */

import bowling.main.BowlingLine;
import bowling.main.BowlingTurn;
import org.junit.Assert;
import org.junit.Test;

public class BowlingTurnTest {
    @Test
    public void testFirstRoll() {
        BowlingTurn turn = new BowlingTurn();
        turn.roll(2).roll(4);
        Assert.assertEquals(2, turn.getFirstRoll());
    }

    @Test
    public void testSecondRoll() {
        BowlingTurn turn = new BowlingTurn();
        turn.roll(2).roll(4);
        Assert.assertEquals(4, turn.getSecondRoll());
    }

    @Test
    public void testSpare() {
        BowlingTurn turn = new BowlingTurn();
        turn.roll(2).roll(8);
        Assert.assertEquals(true, turn.isSpare());
    }

    @Test
    public void testSpare2() {
        BowlingTurn turn = new BowlingTurn();
        turn.roll(2).roll(4);
        Assert.assertEquals(false, turn.isSpare());
    }

    @Test
    public void testStrike() {
        BowlingTurn turn = new BowlingTurn();
        turn.roll(10).roll(0);
        Assert.assertEquals(true, turn.isStrike());
    }

    @Test
    public void testStrike2() {
        BowlingTurn turn = new BowlingTurn();
        turn.roll(2).roll(4);
        Assert.assertEquals(false, turn.isStrike());
    }

}
