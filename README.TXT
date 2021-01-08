------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Player Item Inventory/Manger
PURPOSE OF PROJECT: Java 2 Final Project
VERSION or DATE:12/16/2020
AUTHOR: Matthew Szklany

Classes:
-WeaponClass: 
	WeaponClass is an abstract superclass of the classes Ranged and Melee. It provides 
	the basic framework for the creation of both ranged and melee weapon objects. Fulfills requirement 1A/1C

- Ranged: 
	Ranged is a subclass of and extends the abstract WeaponClass. It is used to make specifically
	ranged game weapons such as bows or firearms. FulFills requirement 1B

- Melee: 
	Melee is a subclass of and extends the abstract WeaponClass. It is used to make specifically
	melee game weapons such as swords or clubs. Fulfills requirement 1B 

- ItemInventory: 
	ItemInventory stores any and all objects created from Ranged and Melee in 3 separate HashMaps based on
	the weapon slot used. It can also write to a file to save the data in the collection. Fulfills 1E/1F

-ItemSort: 
	ItemSort is a class used to read the text file from ItemInventory into a mulitdimensional Array that is
	created of 3 rows, one for each item slot. The text file is read by ItemSort's read method and each item is 
	sorted into one of 3 rows. Also intended to be able to sort items low to high in each row (fulfills 1G)

-Discard: 
	An interface to remove created weapon objects from the various collections that make up player inventory. 
	Intended to fulfill requirement 1D, but errors with implementation caused complications. 

- DoneFrame and DonePanel: 
	Related frame and panel classes to fulfill requirement 1J. Expresses excitement.

-ClothingArmor: 
	Intended to widen the scope of the project to include clothing and armor for a player character as well. 
- MainRanged: 
	Main method for ranged weapon creation (intended to fulfill requirement 1i, but error with enum) 

How to Use: 
	1. Create either a ranged weapon by entering: 
		String weaponName
		String weaponType
		double DamageAmt
		String rarity
		Weaponslot weaponSlot (do this by typing WeaponClass.WeaponSlot.(slot here), slot here will be either: PRIMARY, SECONDARY, HEAVY)
		int rounds
		String rateOfFire
		int Magazine

	or a melee weapom by entering: 
		String weaponName
		String weaponType
		double DamageAmt
		String rarity
		Weaponslot weaponSlot (do this by typing WeaponClass.WeaponSlot.(slot here), slot here will be either: PRIMARY, SECONDARY, HEAVY)
		String material
		String edgeType
		double reach

2. Create an ItemInventory for theoretical player character: 
	Once you create this inventory you can add the items you created to the inventory. 
	Do this by calling the mapAdder method. Then click on the weapon object created in the object bench
	and approve to create it. You can have up to 30 weapons in the inventory (10 of each weaponSlot type). 

3. Call the write method and save it to itemData.txt; 

4. Create an ItemSort Object use the write method to write the itemData.txt file into 
the 2d array. This can then be sorted highest to lowest for each weaponSlot. 

 

5. Create a new panel to and click the button. 


Using Infuse Interface in item inventory: 
	Allows you to boost the damage amount of a lower damage item to that of a higher damage item, but consumes
	the higher damage item in the process. 
	Enter the names of the two items, the one you want to boost(infuseItem) and the one you want to use(useItem)
	in the userInfused method (NOT THE INFUSE METHOD). The items must be of the same slot type and the infuse item
	must be of a lower damage amount than the use item. The infuse item is then boosted and the use item discarded. 
	(fulfills 1D)

SIDENOTE: The ClothingArmor Class and Discard Interface are as of right now, unfinished. 

PATCH NOTES VERSION 3: 

- added/fixed main method in ranged

- fixed bug in infuse interface

- fixed bug in item inventory test fixture 

READ: Had a great a semester, thank you! :) 



Citations for help with project: 
https://www.geeksforgeeks.org/row-wise-sorting-2d-array/ for help with sorting the 2d array
https://stackoverflow.com/questions/34354340/print-specific-row-in-2d-array for help with printing specific rows of the array
https://stackoverflow.com/questions/30676719/how-to-grab-substring-after-a-specific-word-in-java for help with substring to get damage value of String object in cell of 2d array
	
	



