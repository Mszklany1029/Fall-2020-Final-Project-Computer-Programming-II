
import javax.swing.JFrame; 
/**
 * A frame
 *
 * @author Matthew Szklany
 * @version 12/16/2020
 */
public class DoneFrame
{
    //field declarations
    private JFrame frameObject; 
    
    /**
     * Constructor
     */
    public DoneFrame(){
       frameObject = new JFrame("Done Frame"); 
       frameObject.add(new DonePanel());
       frameObject.pack(); 
       frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frameObject.setLocationRelativeTo(null); 
       
       frameObject.setVisible(true);
        
        
        
        
    }
    
}
