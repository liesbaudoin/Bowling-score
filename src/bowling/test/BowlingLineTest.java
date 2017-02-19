package bowling.test;

/**
 * Created by Lies on 7-2-2017.
 */

import bowling.main.BowlingLine;
import bowling.main.BowlingTurn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingLineTest {


    private BowlingLine bowlingLine;

    @Before
    public void setUp() throws Exception {
        bowlingLine = new BowlingLine();
    }

    @Test
    public void test1() {
        bowlingLine.addTurn(bowlingLine.newTurn().roll(3).roll(6));
        Assert.assertEquals(9, bowlingLine.calculateScore());
    }

    @Test
    public void test2() {
        bowlingLine.addTurn(bowlingLine.newTurn().roll(3).roll(6));
        bowlingLine.addTurn(bowlingLine.newTurn().roll(2).roll(5));
        Assert.assertEquals(16, bowlingLine.calculateScore());

    }

    @Test
    public void testSpare() {
        bowlingLine.addTurn(bowlingLine.newTurn().roll(4).roll(6));
        bowlingLine.addTurn(bowlingLine.newTurn().roll(2).roll(5));
        Assert.assertEquals(19, bowlingLine.calculateScore());
    }

    @Test
    public void testStrike() {
        bowlingLine.addTurn(bowlingLine.newTurn().roll(10).roll(0));
        bowlingLine.addTurn(bowlingLine.newTurn().roll(2).roll(5));
        Assert.assertEquals(24, bowlingLine.calculateScore());
    }

  public void testSpareLastFrame(){
        for (int i =1; i <9; i++){
            bowlingLine.addTurn(bowlingLine.newTurn().roll(4).roll(3));
        }
        bowlingLine.addTurn(bowlingLine.newTurn().roll(5).roll(5));
  }
}
