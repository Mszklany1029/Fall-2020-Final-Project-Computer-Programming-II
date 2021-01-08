import java.io.Serializable;
import java.io.IOException;
import java.io.FileOutputStream; 
import java.io.ObjectOutputStream;
/**
 * An abstract SuperClass for the creation of a GameWeapon 
 *
 * @author Matthew Szklany
 * @version 12/14/2020
 */

 
public abstract class WeaponClass implements Serializable
{
    //field declarations
    protected String weaponName; 
    protected String weaponType; 
    protected double damageAmt;
    protected String rarity; 
    protected WeaponSlot weaponSlot;
   
    /**
     * creates an enumeration weaponSlot
     */
    public enum WeaponSlot{PRIMARY, SECONDARY, HEAVY};
    

    /**
     * Constructor
     */
    public WeaponClass(String weaponName, String weaponType, double damageAmt, String rarity, WeaponSlot weaponSlot){
        this.weaponName = weaponName; 
        this.weaponType = weaponType; 
        this.damageAmt = damageAmt; 
        this.rarity = rarity;
        this.weaponSlot = weaponSlot;

        
    }
    
    /**
     * Overload Constructor
     */
    protected WeaponClass(){
        weaponName = null; 
        weaponType = null; 
        damageAmt = 0.0; 
        rarity = null;
        weaponSlot = null;
        
        
        
    }
    
    
    /**
     * Method to assign weapon name
     */
    public void setWeaponName(String weaponName){
        this.weaponName = weaponName;

    }

    /**
     * Method to assign weaponType
     */
    public void setWeaponType(String weaponType){
        this.weaponType = weaponType; 

    }

    /**
     * Method to assign damage amt of weapon
     */
    public void setDamageAmt(double damageAmt){
        this.damageAmt = damageAmt;
    }

    /**
     * Method to assign weapon rarity 
     */
    public void setRarity(String rarity){
        this.rarity = rarity; 
    }
    
    /**
     * Method to assign weaponSlot
     */
    public void setWeaponSlot(WeaponSlot weaponSlot){
        this.weaponSlot = weaponSlot;
        
    }

    /**
     * Method to print out weapon item info
     */
    public void printWeapon(){
        System.out.println(this);
        System.out.println();

    }
    
    /**
     * Method to serialize the weapon 
     */
    public void serializeWeapon(){
        String filename = "Weapon.ser";
        //WeaponClass weapon = new WeaponClass();
        try {
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 

            //out.writeObject(weapon); 

            out.close(); 
            file.close();

            System.out.println("Object has been serialized"); 
        }catch(IOException ioException){
            System.out.println("IOException has been caught");

        }
    }

    /*--------------------------Accessor Methods-------------------------*/ 

    /**
     * Method to get the name of the weapon
     */
    public String getWeaponName(){
        return weaponName;
    }

    /**
     * Method to get the type of the weapon
     */
    public String getWeaponType(){
        return weaponType;
    }

    /**
     * Method to get weapon damage
     */
    public double getWeaponDmg(){
        return damageAmt;
    }

    /**
     * Method to get weapon rarity
     */
    public String getRarity(){
        return rarity;
    }
    
    /**
     * Method to get the slot of the weapon 
     */
    public WeaponSlot getWeaponSlot(){
        return weaponSlot;
    }

    /**
     * Method to override toString
     */
    @Override
    public String toString(){
        String weaponString = "Name: " + weaponName + "\nType: " + weaponType
            + "\nDPS: " + damageAmt + "\nItem Rarity: " + rarity
            + "\nWeapon Slot: " + weaponSlot; 

        return weaponString;

    }
    
    /**
     * Method to get all the details of the weapon object
     */
   // private WeaponClass getWeapon(){
     //   return ;
    //}

}
