package test;

import static org.junit.Assert.*;
import edu.ccsu.cs407.FinalProject.Movements.Fly;
import edu.ccsu.cs407.FinalProject.Movements.Walk;
import edu.ccsu.cs407.FinalProject.Strategies.MovementStrategy;
import junit.framework.Assert;

import org.junit.Test;

/**
 * Class contains test methods for
 * classes that implement MovementStrategy
 * @author Steven Ackley on 11/10/2014.
 */
public class MovementTest {

    /**
     * Method test output of Fly.toString()
     */
    @Test
    public void FlyToString()
    {
        MovementStrategy fly = new Fly();
        String returnString = fly.toString();
        assertEquals(returnString, "Flies in the air");
    }

    /**
     * Method tests output of Walk.toString()
     */
    @Test
    public void WalkToString()
    {
        MovementStrategy fly = new Walk();
        String returnString = fly.toString();
        assertEquals(returnString, "Walks on the ground");
    }
}
