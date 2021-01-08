

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MeleeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MeleeTest
{
    private Melee melee1;

    /**
     * Default constructor for test class MeleeTest
     */
    public MeleeTest()
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
        melee1 = new Melee("Excalibur" , "Broad Sword" , 453.65, "Mythical" , WeaponClass.WeaponSlot.PRIMARY, "Godly Metal" , "Double Edged" , 56.5);
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
