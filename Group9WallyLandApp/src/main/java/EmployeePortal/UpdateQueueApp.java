/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeePortal;

/**
 * UI to update restaurant and ride waiting times.
 * @author jessi
 */
public class UpdateQueueApp {
    
    static private UpdateQueueUI updateQueueUI;
    
     /**
     * Makes the UpdateQueueUI visible. 
     */
    public static void main(String[] args) {
        
        updateQueueUI = new UpdateQueueUI();
        updateQueueUI.setVisible(true);
    } 
    
}  
