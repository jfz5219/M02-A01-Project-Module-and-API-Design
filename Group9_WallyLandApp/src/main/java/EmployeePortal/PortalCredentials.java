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
        
        if (username.equals(visitorUser) ) {
             validated = true;
            
           
            
       
        
       
        //create buttons to change use cases 
        //add action listener event for map grid
        //Find out how to switch from the login cases to the location/statistics case 
        //Should it be a grid with 4 different images with actionlisteners to determine mouse statefulness?? 
        //Once the relevant section of the map is clicked it should show some basic info about the attraction
        //Biggest thing is having a menu that lets you switch use cases 
        //ASK THE PROF!!!!!!!
        //Make this panel that appear to be a navigational panel!!!! 
       
           
            
            System.out.println("Authentication successful");
        } else {
            System.out.println("Invalid credentials");
        }
        return validated;
    }
}
