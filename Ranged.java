
/**
 * A class to make an in-game firearm object
 *
 * @author Matt
 * @version 12/4/2020
 */
public class Ranged extends WeaponClass /*implements Infuse*/
{
    //field declarations
    private int rounds; 
    private String rateOfFire; 
    private int magazine; 
    
    /**
     * Constructor
     */
    public Ranged(String weaponName, String weaponType, double damageAmt, String rarity, WeaponSlot weaponSlot, int rounds, String rateOfFire, int magazine){
        super(weaponName, weaponType, damageAmt, rarity, weaponSlot);
        this.rounds = rounds; 
        this.rateOfFire = rateOfFire;
        this.magazine = magazine; 
    }
    
    /**
     * Overload constructor to be used by main method
     */
    public Ranged(){
         super();
         rounds = 0; 
         rateOfFire = null; 
         magazine = 0;
        
    }
    
    /**
     * Main method
     */
    public static void main(String[] args){
        Ranged ranged = new Ranged(); 
        
        String weaponName = args[0]; 
        ranged.setWeaponName(weaponName); 
        
        String weaponType = args[1];
        ranged.setWeaponType(weaponType);
        
        Double damageAmt = Double.parseDouble(args[2]);
        ranged.setDamageAmt(damageAmt);
        
        String rarity = args[3]; 
        ranged.setRarity(rarity); 
        
        WeaponSlot weaponSlot = WeaponSlot.valueOf(args[4]); 
        ranged.setWeaponSlot(weaponSlot);
        
        int rounds = Integer.parseInt(args[5]);
        ranged.setRounds(rounds);
        
        String rateOfFire = args[6];
        ranged.setRateOfFire(rateOfFire);
        
        int magazine = Integer.parseInt(args[7]);
        ranged.setMagSize(magazine);
    }
    
    /**
     * Method to assign the number of rounds for the firearm
     */
    public void setRounds(int rounds){
        this.rounds = rounds; 
    }
    
    /**
     * Method to assign the rate of fire for the fireArm
     */
    public void setRateOfFire(String rateOfFire){
        this.rateOfFire = rateOfFire; 
    }
    
    /**
     * Method to assign the magazine size of the firearm 
     */
    public void setMagSize(int magazine){
        this.magazine = magazine;
    }
    
    /**
     * Method to print info about the weapon
     */
    public void printRangedInfo(){
        System.out.println(this); 
        System.out.println();
    }
    
    /*------------------------Accessor Methods-----------------------------*/ 
    
    /**
     * Method to get the number of rounds
     */
    public int getRounds(){
        return rounds; 
    }
    
    /**
     * Method to get the rate of fire of the weapon 
     */
    public String getRateFire(){
        return rateOfFire; 
    }
    
    /**
     * Method to return the magazine size of the weapon 
     */
    public int getMagazine(){
        return magazine;
    }
    
    /**
     * Method to override toString()
     */
    @Override
    public String toString(){
        String rangedString = super.toString() + "\nRounds: " + rounds + 
            "\nRate of Fire: " + rateOfFire + "\nMagazine Size: " + magazine;
        return rangedString;
        
    }
    
    /**
     * Method for user to infuse
     */
    //public void userInfuser(Ranged useItem, Ranged infuseItem){
        
    //}
    
    /**
     * Method to compute infusing
     */
    //public void infuse()
}
