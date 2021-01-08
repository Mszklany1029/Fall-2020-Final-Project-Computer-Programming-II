

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RangedTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RangedTest
{
    private Ranged ranged1;

    /**
     * Default constructor for test class RangedTest
     */
    public RangedTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
        ranged1 = new Ranged("Show" , "Bow", 45.05, "Rare" , WeaponClass.WeaponSlot.PRIMARY, 56, ".5/second", 1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
