

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ItemSortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ItemSortTest
{
    private ItemSort itemSort1;

    /**
     * Default constructor for test class ItemSortTest
     */
    public ItemSortTest()
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
        itemSort1 = new ItemSort();
        itemSort1.readIntoMap();
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
