

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ItemInventoryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ItemInventoryTest
{
    private Ranged ranged1;
    private ItemInventory itemInve1;
    private Ranged ranged2;
    private Ranged ranged3;
    private Ranged ranged4;
    private Ranged ranged5;
    private Ranged ranged6;
    private Ranged ranged7;
    private Ranged ranged8;
    private Ranged ranged9;
    private Ranged ranged10;
    private Ranged ranged11;
    private Ranged ranged12;
    private Ranged ranged13;
    private Ranged ranged14;
    private Ranged ranged15;
    private Ranged ranged16;
    private Ranged ranged17;
    private Ranged ranged18;
    private Ranged ranged19;
    private Ranged ranged20;
    private Melee melee1;
    private Ranged ranged21;
    private Ranged ranged22;
    private Melee melee2;
    private Ranged ranged23;
    private Melee melee3;
    private Ranged ranged24;
    private Ranged ranged25;
    private Melee melee4;
    private Ranged ranged26;
    private Ranged ranged27;

    
    
 

    /**
     * Default constructor for test class ItemInventoryTest
     */
    public ItemInventoryTest()
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
        // itemSort1 = new ItemSort();
        // itemSort1.readIntoMap();
        // itemSort1.printSpecficRow(1);
        // itemSort1.printSpecficRow(1);
        // itemSort1.printSpecficRow(2);
        // itemSort1.printSpecficRow(3);
        ranged1 = new Ranged("Khvostov 7G-02", "Auto Rifle", 857.32, "Common", WeaponClass.WeaponSlot.PRIMARY, 600, "10/second", 40);
        itemInve1 = new ItemInventory();
        itemInve1.itemAdder(ranged1);
        ranged2 = new Ranged("Lost and Found", "Pulse Rifle", 820.65, "Common", WeaponClass.WeaponSlot.PRIMARY, 540, "16.875/second", 32);
        itemInve1.itemAdder(ranged2);
        ranged3 = new Ranged("Daystar SMG2", "Submachine Gun", 902.00, "Uncommon", WeaponClass.WeaponSlot.PRIMARY, 900, "25.7/second", 35);
        itemInve1.itemAdder(ranged3);
        ranged4 = new Ranged("Fare-Thee-Well", "Scout Rifle", 927.23, "Uncommon", WeaponClass.WeaponSlot.PRIMARY, 200, "13/second", 15);
        itemInve1.itemAdder(ranged4);
        ranged5 = new Ranged("Agrona PR2", "Pulse Rifle", 1000.00, "Rare", WeaponClass.WeaponSlot.PRIMARY, 450, "16/second", 28);
        itemInve1.itemAdder(ranged5);
        ranged6 = new Ranged("Black Tiger-2sr", "Scout Rifle", 1010.45, "Rare", WeaponClass.WeaponSlot.PRIMARY, 260, "16.25/second", 16);
        itemInve1.itemAdder(ranged6);
        ranged7 = new Ranged("Accrued Redemption", "Bow", 1125.00, "Legendary", WeaponClass.WeaponSlot.PRIMARY, 50, "1/second", 1);
        itemInve1.itemAdder(ranged7);
        ranged8 = new Ranged("Dire Promise", "Hand Cannon", 1175.53, "Legendary", WeaponClass.WeaponSlot.PRIMARY, 140, "2.7/second", 11);
        itemInve1.itemAdder(ranged8);
        ranged9 = new Ranged("The Last Word", "Hand Cannon", 1257.23, "Exotic", WeaponClass.WeaponSlot.PRIMARY, 225, "3.75/second", 8);
        itemInve1.itemAdder(ranged9);
        ranged10 = new Ranged("Outbreak Perfected", "Pulse Rifle", 1249.00, "Exotic", WeaponClass.WeaponSlot.PRIMARY, 450, "13.2/second", 34);
        itemInve1.itemAdder(ranged10);
        ranged11 = new Ranged("Stubborn Oak", "Shotgun", 867.00, "Common", WeaponClass.WeaponSlot.SECONDARY, 55, ".91/second", 5);
        itemInve1.itemAdder(ranged11);
        ranged12 = new Ranged("Spiderbite-1si", "Sidearm", 824.52, "Common", WeaponClass.WeaponSlot.SECONDARY, 360, "6/second", 15);
        itemInve1.itemAdder(ranged12);
        ranged13 = new Ranged("Nox Calyx II", "Fusion Rifle", 967.56, "Uncommon", WeaponClass.WeaponSlot.SECONDARY, 25, ".41/second", 5);
        itemInve1.itemAdder(ranged13);
        ranged14 = new Ranged("Recital-17", "Sidearm", 914.53, "Uncommon", WeaponClass.WeaponSlot.SECONDARY, 450, "7.5/second", 15);
        itemInve1.itemAdder(ranged14);
        ranged15 = new Ranged("Aachen-LR2", "Sniper Rifle", 1032.23, "Rare", WeaponClass.WeaponSlot.SECONDARY, 90, "1.5/second", 4);
        itemInve1.itemAdder(ranged15);
        ranged16 = new Ranged("Botheration Mk.28", "Shotgun", 1065.00, "Rare", WeaponClass.WeaponSlot.SECONDARY, 55, ".9/second", 5);
        itemInve1.itemAdder(ranged16);
        ranged17 = new Ranged("The Mountaintop", "Grenade Launcher" , 1110.54, "Legendary", WeaponClass.WeaponSlot.SECONDARY, 90, "1.5/second", 1);
        itemInve1.itemAdder(ranged17);
        ranged18 = new Ranged("Dream Breaker", "Fusion Rifle", 1152.23, "Legendary" , WeaponClass.WeaponSlot.SECONDARY, 32, ".53/second", 6);
        itemInve1.itemAdder(ranged18);
        ranged19 = new Ranged("Divinity", "Trace Rifle", 1278.65, "Exotic", WeaponClass.WeaponSlot.SECONDARY, 1000, "16.6/second", 94);
        itemInve1.itemAdder(ranged19);
        ranged20 = new Ranged("Cloudstrike", "Sniper Rifle", 1278.56, "Exotic", WeaponClass.WeaponSlot.SECONDARY, 140, "2.3/second", 7);
        itemInve1.itemAdder(ranged20);
        melee1 = new Melee("Traitor's Fate", "Sword", 856, "Common", WeaponClass.WeaponSlot.HEAVY, "Steel", "Single Edged", 56.56);
        ranged21 = new Ranged("Butler RS/2", "Rocket Launcher", 998.56, "Uncommon", WeaponClass.WeaponSlot.HEAVY, 15, ".25/second", 1);
        itemInve1.itemAdder(ranged21);
        ranged22 = new Ranged("Hadrian-A", "Grenade Launcher", 1021.23, "Uncommon", WeaponClass.WeaponSlot.HEAVY, 150, "2.5/second", 3);
        itemInve1.itemAdder(ranged22);
        melee2 = new Melee("Rest for the Wicked", "Sword", 967, "Rare", WeaponClass.WeaponSlot.HEAVY, "Steel", "Single-edged", 32.5);
        itemInve1.itemAdder(melee2);
        ranged23 = new Ranged("Temporal Clause", "Machine Gun", 1189.52, "Legendary", WeaponClass.WeaponSlot.HEAVY, 900, "15/second", 200);
        itemInve1.itemAdder(ranged23);
        melee3 = new Melee("The Lament", "Broad Sword/Chainsaw", 1296.56, "Exotic", WeaponClass.WeaponSlot.HEAVY, "Saw Edge", "Matieral Unknown", 39.32);
        itemInve1.itemAdder(melee3);
        ranged24 = new Ranged("Whisper of the Worm", "Sniper Rifle", 1269.546, "Exotic", WeaponClass.WeaponSlot.HEAVY, 72, "1.2/second", 3);
        itemInve1.itemAdder(ranged24);
        ranged25 = new Ranged("Xenophage", "Heavy Machine Gun", 1269.420, "Exotic", WeaponClass.WeaponSlot.HEAVY, 120, "2/second", 20);
        itemInve1.itemAdder(ranged25);
        melee4 = new Melee("Wordline Zero", "Long Sword", 1289.56, "Exotic", WeaponClass.WeaponSlot.HEAVY, "Energy", "Material Unknown]", 49.2);
        melee4.getMaterial();
        melee4.setMaterial("Material Unknown");
        melee4.getEdgeType();
        melee4.setEdge("Energy");
        itemInve1.itemAdder(melee4);
        ranged26 = new Ranged("Izanagi's Burden", "Sniper Rifle", 1300.00, "Exotic", WeaponClass.WeaponSlot.HEAVY, 90, "1.5/second", 4);
        itemInve1.itemAdder(ranged26);
        //itemInve1.saveInventory();
        ranged27 = new Ranged("Sleeper Simulant", "Linear Fusion Rifle", 1289.23, "Exotic", WeaponClass.WeaponSlot.HEAVY, 40, ".667/second", 3);
        itemInve1.itemAdder(ranged27);
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
