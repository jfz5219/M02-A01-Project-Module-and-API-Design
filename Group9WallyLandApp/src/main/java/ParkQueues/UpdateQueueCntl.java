/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkQueues;

/**
 *
 * @author jessi
 */
public class UpdateQueueCntl {
    private UpdateQueueUI updateQueueUI = null;
    String status;
    
    /**
     * Constructor for the QuickServiceRestaurant
     */
    public UpdateQueueCntl() {
        status = "none";
    }
    
    /**
     * Gets the capacity number from the ride's information table, located in database.
     * @return ride's capacity number
     */ 
    public int getRideLimit() {       
        return 0;
    }
    
    /**
     * Gets the capacity number from the ride's information table, located in database.
     * @return restaurant's capacity number
     */ 
    public int getRestaurantLimit() {       
        return 0;
    }    
    
    /**
     * Gets current total and uses the restaurant's capacity that's stored in 
     * our database to calculate the waiting time.
     * @param count the current number of people waiting in line (updated by staff).
     */   
    public void calculateRestaurantTime(int count) {
        int capacity = getRestaurantLimit();
        count = 0;
    } // end calculateRideTime()

    /**
     * Gets current total and uses the ride's capacity that's stored in 
     * our database to calculate the waiting time.
     * @param count the current number of people waiting in line (updated by staff).
     */   
    public void calculateRideTime(int count) {
        int capacity = getRideLimit();
        count = 0;
        
    } // end calculateRideTime()

}  // end class QuickServiceRestaurant


