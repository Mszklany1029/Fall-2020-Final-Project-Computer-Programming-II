
/**
 * An interface to infuse weapons: 
 * Consumes the item of the higher power level, boosting the power level of 
 * the lower item to that the higher item, destroying the higher item in the process.
 *
 * @author (Matthew Szklany)
 * @version (12/17/2020)
 */
public interface Infuse
{ 
    /**
     * A method to infuse an item
     */
    public abstract void infuse();
}
