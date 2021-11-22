/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeePortal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jessi
 */
public class UpdateQueueModel {
        private final List rideInfo;
        private final List restaurantInfo;
        private static ArrayList<String[]> displayList = new ArrayList<String[]>();
//        private static ArrayList<String> info = new ArrayList<String>();
     

    /**
     * creates a list which will be holding all the ride information 
     */
    public UpdateQueueModel() {
//        List<List<String>> listOfPlaces = new ArrayList<>();
//        List<String> rideOrRestaurant = new ArrayList<>();
//        

        rideInfo = new ArrayList<>();
        restaurantInfo = new ArrayList<>();
    }
    
  
    public List<String[]> retrieveList() {
            
        try {
            String file = "ride_data.txt";
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                String[] line = st.split(", ");
                displayList.add(line);
                           
            }
            
        } catch (IOException ioe) {
            System.err.println("Trouble reading from the file: " + ioe.getMessage());
        }
        
        return displayList;
        }
    
    public List<String[]> getCurrentList() {
        
        return displayList;
        }
    
    
    // This calculates waiting time and returns most updated list of restaurant and rides
    public List<String[]> updatedList(String name, float enter, float leave) {
        
        displayList = (ArrayList<String[]>) retrieveList();
        
        // This formula is from https://web.mst.edu/~gosavia/queuing_formulas.pdf
        float arrivalRate = (float) enter/60;

        float exitRate = (float) leave/60;
        
        float utilOfServer = (float) arrivalRate/exitRate;
        
        float NumInQueue = (float) utilOfServer*utilOfServer / (1 - utilOfServer);
                
        float waitTime = (float) NumInQueue/arrivalRate;

        // changes waiting time of ride or restaurant
        for (int i = 0; i < displayList.size(); i++) {
            if(displayList.get(i)[1].equals(name)){
            displayList.get(i)[2] = String.valueOf(Math.round(waitTime));
            
            }
        }
        return displayList;
    }

}
