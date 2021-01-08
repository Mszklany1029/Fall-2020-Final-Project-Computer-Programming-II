import java.io.FileReader; 
import java.io.IOException; 
import javax.swing.JFileChooser; 
import java.io.File; 
import java.util.Scanner; 
import java.util.Set; 
import java.util.Iterator; 
/**
 * Class to read the saved item data file sort it based on damage level
 *
 * @author Matthew Szklany
 * @version 12/16/2020
 */
public class ItemSort
{
    //field declarations
    private String fileName; 
    private String mapData; 
    private String[][] data;
    private final static String PRIMARY = "PRIMARY"; 
    private final static String SECONDARY = "SECONDARY"; 
    private final static String HEAVY = "HEAVY";
    private int numRows; 
    private int numCols;

    /**
     * Constructor
     */
    public ItemSort(){
        fileName = "ItemData.txt"; 
        numRows = 3;
        numCols = 10; 
        data = new String[numRows][numCols]; 

    }
    /**
     * Method to read all the items 
     */
    public void readIntoMap(){
        JFileChooser chooserObject = new JFileChooser("./");
        int buttonInt = chooserObject.showOpenDialog(null); 
        File fileObject = null; 

        if(buttonInt == JFileChooser.APPROVE_OPTION){
 
            try{
                fileObject = chooserObject.getSelectedFile(); 
                FileReader reader = new FileReader(fileName);
                String fullItem = null;
                String[] itemParts = null; 
                String itemType = null;//itemParts[0]; 
                String itemData = null;//itemParts[1];
                String[] slotArray = {"PRIMARY", "SECONDARY", "HEAVY"};
                int primaryCounter = 0; 
                int secondaryCounter = 0; 
                int heavyCounter = 0;
                

                Scanner fileIn = new Scanner(reader); 
                fileIn.useDelimiter(", "); 

                while(fileIn.hasNext()){
                    fullItem = fileIn.next();
                    itemParts = fullItem.split("- "); 
                    itemType = itemParts[0];
                    itemData = itemParts[1];
                    

                    switch(itemType){
                        case PRIMARY:
                         
                        

                       // for(int col = 0; col< numCols; col++){
                            data[0][primaryCounter] = itemData;
                            primaryCounter++; 
                        //}

                        break;

                        case SECONDARY: 
                        
                        

                        //for(int col = 0; col < numCols; col++){
                            data[1][secondaryCounter] = itemData;
                            secondaryCounter++;
                        //}

                        break;
                        
                        case HEAVY: 
                        
                        
                       // for(int col = 0; col < numCols; col++){
                            data[2][heavyCounter] = itemData;
                            heavyCounter++;
                       
                        //}

                        break; 

                    }
                    
                }

                reader.close();
            }catch(IOException ioExpcetion){
                System.out.println("Error Processing File");
            }

        }

    }

    /**
     * Method to print out 2d array
     */   
    public void printData(){
        int i = 0;
        
        for(int row = 0; row < data.length; row++){
            
            for(int col = 0; col < data[row].length; col++){
                i++; 
                
                System.out.println(i + "// " + data[row][col]); 
                System.out.println(); 
                
                
            }
            System.out.println("---------------------------"); 
        }
        // for(String[] x : data){

            // for(String y : x){
                // i++;

                // System.out.println(i + "// " +  y + " "); 
                // System.out.println();

            // }
            // System.out.println();

        // }

    } 
    
    /**
     * Method to print specific row of Array
     * @Param Retreieves which row you would like to print, subtracts 1 to get index
     */
    public void printSpecficRow(int r){
        int index = r - 1;
        int count = 0;
        for(int col = 0; col < numCols; col++){
            System.out.println(count++ + ". " + data[index][col]); 
            System.out.println(); 
        }
        System.out.println();
        
        
        
    }
    
    /**
     * Method to get a double from one of the arrayElements
     * @param insert row and column of the cell desired, converts to index
     */
    public double getDamageDouble(int r, int c){
         int rowDex = r - 1; 
         int colDex = c - 1;
         
        String totalData = data[rowDex][colDex].toString();
        int startIndex = totalData.indexOf("DPS: ")+5; 
        int endIndex = totalData.indexOf("\nItem R");
        
        String dubString = totalData.substring(startIndex, endIndex);
        
        double damage = Double.parseDouble(dubString);
         
        return damage;
    }

    
    /**
     * Method to sort 
     */
    public void sort(){
        String holder = null; 
        String lowIndex = null; 
        for(int i = 0; i < data.length; i++){
            
            for(int y = 0; y < data[i].length; y++){
                
                for (int x = 0; x < data[i].length - y - 1; y++){
                        //int store = data[i,x];
                        
                        if(getDamageDouble(i  , x ) > getDamageDouble(i, x + 1) )
                        {
                            //holder = data[getDamageDouble(i,x)]; 
                            lowIndex = data[i][x];
                            data[i][x] = data[i][x+1]; 
                            data[i][x+1] = lowIndex;
                        }
                    
                        
                        //holder = data[i][y].getDamageDouble();
                        //holder = getDamageDouble(i, y);
                        //lowIndex = 
                        
                    
                }
                
            }
            
        }
        
        
        //getDamageDouble();
        
    }
    
    /**
     * Method to sort by damage
     */
    public void damageSort(){
        String holder = null; 
        String lowIndex = null; 
        
        // for(int x = 0; x < data.length; x++){
            // for (int y = 0; y < data.length; y++){
                // for (int i = 0; i < data.length; i++){
                    // for(int j = 0; j < data.length; j++){
                        
                        // if(getDamageDouble(i +1,j +1) > getDamageDouble(x +1, y +1)){
                            // lowIndex = data[x][y];
                            // data[x][y] = data[i][j];
                            // data[i][j] = lowIndex; 
                            
                            
                        // }
                        
                        
                    // }
                    
                    
                // }
                
                
            // }
            
            
            
        // }
        
        for(int startRow = 0; startRow < data.length -1; startRow++){
            for(int startCol = 0; startCol < data.length -1; startCol++){
                lowIndex = data[startRow][startCol]; 
                
                for(int nextRow = startRow +1; nextRow < data.length; nextRow++){
                    for(int nextCol = startCol +1; startCol < data.length; nextCol++){
                        
                        if(getDamageDouble(nextRow, nextCol) < getDamageDouble(startRow+1, startCol+1)){
                            lowIndex = data[nextRow][nextCol];
                            
                        } 
                     
                    }
                
                }
                holder = data[startRow][startCol];
                data[startRow][startCol] = lowIndex; 
                lowIndex = holder;
                
            }
          
            
        }
        
        
        
    }
    
    public void damageSortFix(){
        String holder = null; 
        int lowRow = 0;
        int lowCol = 0;
       for(int rowStart = 0; rowStart < data.length; rowStart++){
           
           for(int colStart = 0; colStart < data[rowStart].length; colStart++){
               //lowRow = rowStart;
               lowCol = colStart; 
               for(int nextCol = colStart +1; nextCol < data[rowStart].length; nextCol++){
                   if(getDamageDouble(rowStart +1, nextCol+1) < getDamageDouble(rowStart+1, lowCol+1)){
                       //lowIndex = data[rowStart][nextCol];
                       //lowRow = rowStart; 
                       lowCol = nextCol; 
                    }
                   
                }
               
                holder = data[rowStart][colStart]; 
                data[rowStart][colStart] = data[rowStart][lowCol];
                data[rowStart][lowCol] = holder;
                //data[rowStart][colStart] = lowIndex;
                //lowIndex = holder;
            }
            
        }
        
        // data[0].length;
        
        
        
    }
    
}
