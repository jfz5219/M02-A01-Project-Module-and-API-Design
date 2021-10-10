package LocationServices;

import java.util.ArrayList;

/**
 * This class is designed to generate user-readable direction to follow 
 * In order to get to the user's desired destination
 * @author Evan
 */
public class Directions extends FindLocation {
    
    /**
     * This method returns the user-readable 
     * @param userLocation
     * @return 
     */
    public ArrayList<String> getDirections(double userLat, double userLong) {
       String userLocation = getLocation(userLat, userLong);
       ArrayList<String> area1Directions = new ArrayList<>();
        ArrayList<String> parkDirections = new ArrayList<>();
        if (userLocation != "Park area 1") {
            return area1Directions;
        }
        return parkDirections;
    }
    
}
