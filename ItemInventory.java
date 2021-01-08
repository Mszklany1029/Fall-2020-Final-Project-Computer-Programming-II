
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.List; 
import java.util.HashMap;
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner; 
import java.io.FileReader; 
import javax.swing.JFileChooser; 
import java.io.File; 
import java.lang.Thread;

/**
 * A class to make an Item Inventory
 * 
 * @author Matthew Szklany
 * @version 12/16/2020
 */

public class ItemInventory implements Infuse{
    //field declarations
    private String fileName; 
    private HashMap<String, WeaponClass> primaryMap; 
    private HashMap<String, WeaponClass> secondaryMap; 
    private HashMap<String, WeaponClass> heavyMap;
    private String infuseItem;
    private String useItem;
    private final Integer MAX_SIZE = 10;

    /**
     * Constructor
     */
    public ItemInventory(){
        fileName = "itemData.txt";        
        primaryMap = new HashMap<>();
        secondaryMap = new HashMap<>(); 
        heavyMap = new HashMap<>();
        infuseItem = null; 
        useItem = null;

    }

    /**
     * method to handle adding to the hashMap
     */
    public void itemAdder (WeaponClass weapon){

        WeaponClass.WeaponSlot slotHolder = weapon.getWeaponSlot();

        switch(slotHolder){
            case PRIMARY:

            if(primaryMap.size() < MAX_SIZE){
                primaryMap.put(weapon.getWeaponName(), weapon);
            }else{ System.out.println("Inventory Slot Full!"); }
            break;

            case SECONDARY: 
            
            if(secondaryMap.size() < MAX_SIZE){
                secondaryMap.put(weapon.getWeaponName(), weapon);
            }else{ System.out.println("Inventory Slot Full!"); }
            break; 

            case HEAVY: 
           
            if(heavyMap.size() < MAX_SIZE){
                heavyMap.put(weapon.getWeaponName(), weapon);
            }else{ System.out.println("Inventory Slot Full!"); }
            break;
        }

    }

    /**
     * Method to read and write to a file
     */
    public void saveInventory(){
        JFileChooser chooserObject = new JFileChooser("./");
        int buttonInt = chooserObject.showSaveDialog(null);
        File fileObject = null; 
        String weaponName = null;
        WeaponClass weaponHolder = null;
        WeaponClass slotHold = null;
        WeaponClass.WeaponSlot slotGetter = null; 
        String slotString = null;
        HashMap<String, WeaponClass> allMap = new HashMap<>();
        allMap.putAll(primaryMap); 
        allMap.putAll(secondaryMap);
        allMap.putAll(heavyMap); 

        Set<String> allSet = allMap.keySet(); 
        Iterator<String> itemIterator = allSet.iterator(); 

        if(buttonInt == chooserObject.APPROVE_OPTION){
            try{
                fileObject = chooserObject.getSelectedFile(); 
                FileWriter writerObject = new FileWriter(fileName);
 
                while(itemIterator.hasNext()){
                    weaponName = itemIterator.next();
                    slotHold = allMap.get(weaponName); 
                    slotGetter = slotHold.getWeaponSlot();
                    slotString = slotGetter.name();
                    writerObject.write(slotString + "- "); 
                    //weaponHolder = allMap.get(weaponName); 
                    writerObject.write(slotHold + ", "); 

                }

                writerObject.close();

            }catch(IOException ioException){
                System.out.println("Error Procesing File"); 

            }

        }
    }
    
    /**
     * Method to infuse items user
     */
    public void userInfuser(String infuseItem, String useItem){
        this.infuseItem = infuseItem; 
        this.useItem = useItem; 
        infuse();
    }
    
    
    /**
     * Method to infuse items compute
     */
    
   
    public void infuse(){
        HashMap<String, WeaponClass> infuseMap = new HashMap<>();
        String weaponGet = null;
        WeaponClass fusedWeapon = null; 
        WeaponClass infItem = null;
        WeaponClass uItem = null; 
        WeaponClass addWeapons = null; 
        infuseMap.putAll(primaryMap); 
        infuseMap.putAll(secondaryMap);
        infuseMap.putAll(heavyMap); 
        
        primaryMap.clear();
        secondaryMap.clear(); 
        heavyMap.clear();
        
        infItem = infuseMap.get(infuseItem); 
        uItem = infuseMap.get(useItem);
        infuseMap.remove(infuseItem, useItem);
        
        if(infItem.getWeaponSlot() == uItem.getWeaponSlot() && uItem.getWeaponDmg() > infItem.getWeaponDmg()){
            infItem.setDamageAmt(uItem.getWeaponDmg()); 
            infuseMap.put(infItem.getWeaponName(), infItem);
            
        }else{
            System.out.println("Items are not compatible"); 
        }
       
        Set<String> infuseSet = infuseMap.keySet(); 
        Iterator<String> putIteration = infuseSet.iterator();
        while(putIteration.hasNext()){
            weaponGet = putIteration.next(); 
            addWeapons = infuseMap.get(weaponGet);
            itemAdder(addWeapons); 
            
            
        }
        
        
        
        
        
    }
    
    /**
     * Method to print out the maps
     */
            
        
    }

    /**
     * Method to print out the 3 maps
     */
    
    /**
     * Method to print out the primary map
     */
    

