/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeePortal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jessi
 */
public class UpdatedQueueModel {
        private final List rideInfo;
        private final List restaurantInfo;

    /**
     * creates a list which will be holding all the ride information 
     */
    public UpdatedQueueModel() {
        rideInfo = new ArrayList<>();
        restaurantInfo = new ArrayList<>();
    }

     /**
     * Will update the ride waiting time
     * @param index is the selected ride that will be changed
     */
    public void updateRideWaitingTime(int index) {
    }
    
     /**
     * Will update the ride waiting time
     * @param index is the selected ride that will be changed
     */ 
    public void updateRestaurantWaitingTime(int index) {
    }
}
