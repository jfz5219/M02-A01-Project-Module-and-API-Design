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
public class QueueCntl {
    private QueueUI QueueUI = null;
    String status;
    
    /**
     * Constructor for the QuickServiceRestaurant
     */
    public QueueCntl() {
        status = "none";
    }
    
     /**
     * Gets current ride waiting time.
     * @param rideName the selected ride user wants to see the wait time for.
     * @return ride's wait time
     */   
    public int getRideTime(String rideName){       
        return 0;
    }
    
     /**
     * Gets current ride waiting time.
     * @param restaurantName the selected ride user wants to see the wait time for.
     * @return restaurant's wait time
     */   
    public int getRestaurantTime(String restaurantName){       
        return 0;
    }
}
