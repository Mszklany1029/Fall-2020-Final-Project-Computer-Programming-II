import javax.swing.JPanel; 
import javax.swing.JLabel; 
import java.awt.Dimension;
import java.awt.Color; 
import javax.swing.JButton; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
/**
 * A panel to be done with 
 *
 * @author Matthew Szklany
 * @version 12/16/2020
 */
public class DonePanel extends JPanel
{
    private Color colorObject; 
    private JButton doneButton; 
    private JLabel doneLabel;
    private JLabel exciteLabel;
    
    /**
     * Constructor
     */
    public DonePanel(){
        super(); 
        setPreferredSize(new Dimension(500,500));
        colorObject = new Color(112, 134, 255); 
        setBackground(colorObject); 
        
        doneLabel = new JLabel("Is Matt excited to be done with the semester?");
        add(doneLabel);
        doneButton = new JButton("Find Out!");
        add(doneButton);
        doneButton.addActionListener(new Pressed()); 
        
        exciteLabel = new JLabel();
        add(exciteLabel);
        
        
    }
    
    private class Pressed implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent event){
           remove(doneButton); 
           remove(doneLabel);
           
           repaint(); 
           
           exciteLabel.setText("EXTREMELY :)");
           
           
        }
        
        
        
        
    }
    
    
   
}
