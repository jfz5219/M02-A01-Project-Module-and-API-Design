/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeePortal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jessi
 */
public class UpdateQueueModel {

//        private static ArrayList<String> info = new ArrayList<String>();
    public UpdateQueueModel() {
    }

    //Gets list from data txt file
    public static List<String[]> retrieveList() {
        List<String[]> displayList = new ArrayList<String[]>();
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

    // This calculates waiting time and updates the data txt file
    public static String updateData(String name, float enterRate, float leaveRate) throws IOException {

        List<String[]> updatedList = (ArrayList<String[]>) retrieveList();
        int waitTime = 0;
        
        if(enterRate == 0 && leaveRate == 0){
        // waitTime is already initialized to 0.
        }
        //If enter rate and leave rate equals each other, the wait time is estimated to be between 13-16 minutes.
        else if (enterRate == leaveRate) {
            waitTime = 14;
        } else {
            // This formula is from https://virtuaq.com/blog/2017-11-23-basics-of-queuing-theory
            float decTime = (float) enterRate / (leaveRate * (leaveRate - enterRate));

            System.out.println(decTime);
            
            //-1.1 is the max decimal time after the first sig fig becomes 0, so this will make it become positive.
            if(decTime > -1.2 && decTime <=-1){
            decTime = abs(decTime);
            } else if(decTime > -1 && decTime <0){
            decTime = abs(decTime + 2);
            }
            System.out.println(decTime);
            
            waitTime = (int)(abs(decTime) * 15);

        }

        // changes waiting time of ride or restaurant
        for (int i = 0; i < updatedList.size(); i++) {
            if (updatedList.get(i)[1].equals(name)) {
                updatedList.get(i)[2] = String.valueOf(Math.round(waitTime));

                //Update status as well using wait time
                if (waitTime > 25) {
                   
                  updatedList.get(i)[3]=("Very busy");

                } else if (waitTime > 20) {
                    updatedList.get(i)[3]=("Busy");

                } else if (waitTime > 10) {
                    updatedList.get(i)[3]=("A little busy");

                } else {
                    updatedList.get(i)[3]=("Not Busy");
                }

            }
        };

        FileWriter writer = new FileWriter("ride_data.txt");
        for (String[] str : updatedList) {
            writer.write(str[0] + ", " + str[1] + ", " + str[2] + ", " + str[3] + ", "+str[4] + System.lineSeparator());
        }
        writer.close();

        return "Update Sucessful";
    }

}
