
package LocationServices;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class locationUI extends JFrame  {
    private final locationCntl cntl;
    
    public locationUI(locationCntl locationCntl) {
        this.cntl = locationCntl;
        initComponents();
    }
    
    private void initComponents() {
        String location = JOptionPane.showInputDialog(null,"Enter your Park Section (Sections Numbers: 1,2,3,4)");
       int response = JOptionPane.showConfirmDialog(null, "Is this your location: "
                + location
                + " ?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       if (response == JOptionPane.YES_OPTION) {
    JFrame attractionLocations=new JFrame("Nearby Park Attractions");   
    attractionLocations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final JLabel label = new JLabel();          
    label.setHorizontalAlignment(JLabel.CENTER);  
    label.setSize(500,200);  
    JButton nextButton=new JButton("Next");  
    nextButton.setBounds(200,100,75,50);  
    // Hard Coded Location Values
    String locations[] = cntl.toStringArray();        
    final JComboBox cb=new JComboBox(locations);    
    cb.setBounds(50, 100,150,50);    
    
    
    // Add labels, combobox, and buttons to fishingLocation frame as well as set its size
    attractionLocations.add(cb); attractionLocations.add(label); attractionLocations.add(nextButton);    
    attractionLocations.setLayout(null);    
    attractionLocations.setSize(350,350);   
    attractionLocations.setVisible(true);
       
    //Next button functionality in here?
     nextButton.addActionListener((ActionEvent e) -> {
         int response1 = JOptionPane.showConfirmDialog(null, "Is this your current location?: "
                 + cb.getItemAt(cb.getSelectedIndex())
                 + " ?", "Confirm",
                 JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         int locationIndex = cb.getSelectedIndex();
        if (response1 == JOptionPane.YES_OPTION && locationIndex == 0) {
            cntl.parkSec1();
        }
        if (response1 == JOptionPane.YES_OPTION && locationIndex == 1) {
            cntl.parkSec2();
        }
        if (response1 == JOptionPane.YES_OPTION && locationIndex == 2) {
            cntl.parkSec3();
        }
        if (response1 == JOptionPane.YES_OPTION && locationIndex == 3) {
            cntl.parkSec4();
        }
    });
       }       
    }
    
  
    
}
