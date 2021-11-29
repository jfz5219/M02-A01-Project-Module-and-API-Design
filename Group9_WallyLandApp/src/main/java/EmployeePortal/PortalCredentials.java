package EmployeePortal;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Method to access employee login
 *
 * @author Justin
 */
public class PortalCredentials {

    private Boolean validated;
    
    /*
    * @param username stores input credential
    * @param password stores input password in String
    * @param validated boolean stores status of 
     */
    public boolean checkCredentials(String username, String password) {
        
        
        /*
        TODO: 
        Validate credentials on submit
         */
        validated = false;
        // placeholder valid user credentials
        String validUser = "admin";
        String validPass = "password";
        String visitorUser = "visitor";
        String validVisitor = "password";
        // update view on validation
        if (username.equals(validUser) && password.equals(validPass)) {
            validated = true;
            
            JPanel accountPanel = new JPanel(new GridLayout(5,1));
            JButton attractionsButton = new JButton("Attractions");
            JButton ridesButton = new JButton("Rides");
            JButton helpButton = new JButton("Help");
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(attractionsButton);
            buttonPanel.add(ridesButton);
            buttonPanel.add(helpButton);
            
        JFrame accountFrame = new JFrame();
        JTextField uNameField = new JTextField();
        uNameField.setPreferredSize(new Dimension(150,50));
        JTextField accountStatusField = new JTextField();
        accountStatusField.setPreferredSize(new Dimension(150,50));
        
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.add(uNameField);
        textFieldPanel.add(accountStatusField);
        textFieldPanel.setPreferredSize(new Dimension(400,300));
        uNameField.setText("Admin");
        accountStatusField.setText("Employee");
        accountFrame.add(textFieldPanel);
        
        accountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountFrame.setLocationRelativeTo(null);
        accountFrame.setPreferredSize(new Dimension(400,300));
        accountFrame.pack();
        accountFrame.add(accountPanel);
        accountFrame.add(buttonPanel);
        accountFrame.setVisible(true);
           
            
            System.out.println("Authentication successful");
        } 
        if (username.equals(visitorUser) && password.equals(validVisitor)) {
             validated = true;
            
            JPanel accountPanel = new JPanel(new GridLayout(5,1));
            JButton attractionsButton = new JButton("Attractions");
            JButton ridesButton = new JButton("Rides");
            JButton helpButton = new JButton("Help");
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(attractionsButton);
            buttonPanel.add(ridesButton);
            buttonPanel.add(helpButton);
            
        JFrame accountFrame = new JFrame();
        JTextField uNameField = new JTextField();
        uNameField.setPreferredSize(new Dimension(150,50));
        JTextField accountStatusField = new JTextField();
        accountStatusField.setPreferredSize(new Dimension(150,50));
        
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.add(uNameField);
        textFieldPanel.add(accountStatusField);
        textFieldPanel.setPreferredSize(new Dimension(400,300));
        //create buttons to change use cases 
        //add action listener event for map grid
        //Find out how to switch from the login cases to the location/statistics case 
        //Should it be a grid with 4 different images with actionlisteners to determine mouse statefulness?? 
        //Once the relevant section of the map is clicked it should show some basic info about the attraction
        //Biggest thing is having a menu that lets you switch use cases 
        //ASK THE PROF!!!!!!!
        uNameField.setText("Visitor UName");
        accountStatusField.setText("Visitor");
        accountFrame.add(textFieldPanel);
        
        accountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountFrame.setLocationRelativeTo(null);
        accountFrame.setPreferredSize(new Dimension(400,300));
        accountFrame.pack();
        accountFrame.add(accountPanel);
        accountFrame.add(buttonPanel);
        accountFrame.setVisible(true);
           
            
            System.out.println("Authentication successful");
        } else {
            System.out.println("Invalid credentials");
        }
        return validated;
    }
}
