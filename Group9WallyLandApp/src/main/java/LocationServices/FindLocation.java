package LocationServices;

import javax.swing.JFrame;

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
        
        /*
        TODO: 
        Implement geo-coordinates transaltion 
        */
        String location = "Longitude + Latitude"; 
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
        mapFrame.add(currentLocation);
        mapFrame.add(attractionNames);
        */
        
        
        return mapFrame;
    }
    
    
    public static void main(String[] args) {
        
    }
}
