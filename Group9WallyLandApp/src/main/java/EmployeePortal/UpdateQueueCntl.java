/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeePortal;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author jessi
 */
public class UpdateQueueCntl {
    private final UpdateQueueUI view;
    private final UpdateQueueModel model;
    String status;
    
    /**
     * Constructor for the QuickServiceRestaurant
     */
    public UpdateQueueCntl() {
        view = new UpdateQueueUI(this);
        model = new UpdateQueueModel();
        view.setVisible(true);
        status = "none";
    }
    
    // gets updated waiting time of list
    public void update(String name, float enter, float leave) throws IOException {    
            model.updateData(name, enter, leave);
    }
    
    /**
     * Gets current list of ride and restaurants
     */ 
    public List<String[]> getList() {       
        return model.retrieveList();
    }
    

}  // end class QuickServiceRestaurant


