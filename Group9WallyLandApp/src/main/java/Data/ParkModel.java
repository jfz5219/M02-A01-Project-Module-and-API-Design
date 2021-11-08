/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jessi
 */
public class ParkModel {
        
        private static List<String[]> displayList = new ArrayList<String[]>();
//        private static ArrayList<String> info = new ArrayList<String>();
       
        public static List<String[]> retrieveList(String display) {
            
        try {
            String file = "ride_data.txt";
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                String[] line = st.split(", ");

                if(display.equals(line[0])){
                    displayList.add(line);
                }            
            }
            
        } catch (IOException ioe) {
            System.err.println("Trouble reading from the file: " + ioe.getMessage());
        }
        return displayList;
    }
}
