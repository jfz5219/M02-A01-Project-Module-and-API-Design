//Does this need a main driver 
//How to instantiate controller/switch use cases from login to location? 
//4 part grid with images and a actionlistenener on the mouse statefulness??? (Hover, click) 
// No need to ask user location simply select section of the map and view information on each relevant location 
package LocationServices;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FindLocation {
    
    /**
     * This method gets the user's location in longitude and latitude coordinates 
     * Then translates those coordinates into a string called Location 
     * The method returns the String Location telling the user their current Location
     * @param Longitude: stores user Longitude in type double 
     * @param latitude: stores user Latitude in type double 
     * @return returns string location, translated from longitude and latitude coordinates
     */
    public String getLocation(double Longitude, double latitude) {
        String location = "Longitude + Latitude"; 
        
       if (Longitude > 15) {
           location = "WallyLand section 1";
       } else if (latitude < 10) {
           location = "WallyLand section 2";
       } else {
           location = "not currently in park";
       }
        /*
        TODO: 
        Implement geo-coordinates transaltion 
        */
        
        return location;
        
    }
    
    
    /**
     * This method uses a JFrame to display user location and nearby attractions on a map
     * @param attractionNames: Nearby Attraction Names displayed on map  
     * @param currentLocation: String that tells the user their current location ex: "you are here"
     * @return Returns JFrame mapFrame to display user location on Map 
     */
    public JFrame showLocation(String attractionNames, String currentLocation){
        JFrame mapFrame = new JFrame();
       /*
        TODO: 
        Implement applying elements to map frame. 
        */
       
        
        return mapFrame;
    }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
            locationCntl cntl = new locationCntl(); // Instantiating the controller is neccesary 
        });
    }
}
