package edu.ccsu.cs407.FinalProject.Test;

import static org.junit.Assert.*;
import edu.ccsu.cs407.FinalProject.FightStrategies.FightStrategy;
import edu.ccsu.cs407.FinalProject.FightStrategies.Fights;
import edu.ccsu.cs407.FinalProject.FightStrategies.RunAway;

import org.junit.Test;

/**
 * @author Steven Ackley on 11/10/2014.
 */
public class FightTest {

    /**
     * Method test the Fights.toString()
     */
    @Test
    public void FightToString(){
        FightStrategy strategy = new Fights();
        String retVal = strategy.toString();
        assertEquals(retVal, "Fights");

    }

    /**
     * Method test the RunAway.toString()
     */
    @Test
    public void RunAwayToString(){
        FightStrategy strategy = new RunAway();
        String retVal = strategy.toString();
        assertEquals(retVal, "Runs Away");
    }
}
