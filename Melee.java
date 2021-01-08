
/**
 * Class to make a melee weapon 
 *
 * @author Matthew Szklany
 * @version 12/4/2020
 */
public class Melee extends WeaponClass
{
    //field declarations
    private String material;
    private String edgeType;
    private double reach;
    
    /**
     * Constructor
     */
    public Melee(String weaponName, String weaponType, double damageAmt, String rarity, WeaponSlot weaponSlot, String material, String edgeType, double reach){
        super(weaponName, weaponType, damageAmt, rarity, weaponSlot);
        this.material = material; 
        this.edgeType = edgeType; 
        this.reach = reach; 
    }
    
    /**
     * Method to set the melee weapon material
     */
    public void setMaterial(String material){
        this.material = material;
    }
    
    /**
     * Method to set the edgeType of the melee weapon 
     */
    public void setEdge(String edgeType){
        this.edgeType = edgeType;
    }
    
    /**
     * Method to set the reach of the melee weapon 
     */
    public void setReach(double reach){
        this.reach = reach;
    }
    
    /**
     * Method to print out information about the melee weapon 
     */
    public void printMeleeInfo(){
        System.out.println(this); 
        System.out.println();
        
    }
    
    /*-------------------------Accessor Methods---------------------------*/ 
    
    /**
     * Method to get the material of the melee weapon 
     */   
    public String getMaterial(){
        return material;
    }
    
    /**
     * Method to get the edgeType of the weapon 
     */
    public String getEdgeType(){
        return edgeType;
    }
    
    /**
     * Method to get the reach of the weapon 
     */
    public double getReach(){
        return reach;
    }
    
    /**
     * Method to override toString()
     */
    @Override
    public String toString(){
        String meleeString = super.toString() + "\nMaterial: " + material + 
            "\nEdge Type: " + edgeType + "\nReach: " + reach + " inches";
        return meleeString;
    }
}
