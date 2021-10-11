/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeePortal;

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
     * @return restaurant's wait time
     */   
    public int calculateRestaurantTime(int count) {
        int capacity = getRestaurantLimit();
        count = 0;
        
        return 0;
    } // end calculateRideTime()

    /**
     * Gets current total and uses the ride's capacity that's stored in 
     * our database to calculate the waiting time.
     * @param count the current number of people waiting in line (updated by staff).
     * @return ride's wait time
     */   
    public int calculateRideTime(int count) {
        int capacity = getRideLimit();
        count = 0;
        
        return 0;
    } // end calculateRideTime()
    
     /**
     * Saves most up to date waiting time to the rides database for users to view.
     * Will save the return value from calculateRideTime function.
     */  
    public void saveRideTime(){       
    }
    
    /**
     * Saves most up to date waiting time to the rides database for users to view.
     * Will save the return value from calculateRestaurantTime function.
     */ 
    public void saveRestaurantTime(){
    
    }

}  // end class QuickServiceRestaurant


