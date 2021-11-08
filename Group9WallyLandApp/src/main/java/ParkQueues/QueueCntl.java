/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkQueues;

import Data.ParkModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jessi
 */
public class QueueCntl {
      
    private static final int STARTING_INDEX_OF_DISPLAY = 100;
    //A list of Rides and Restaurants
    private final ArrayList listOfRR;
    private final QueueUI queueUI;

    /**
     * creates a new StudentList(), which should be populated in that class
     * creates and makes visible a new StudentUI showing first item in list
     */
    public QueueCntl() {
        listOfRR = new ArrayList();
        queueUI = new QueueUI(this, STARTING_INDEX_OF_DISPLAY); // pass 0 so UI starts at first element in list
        queueUI.setVisible(true);
    }

    List<String[]> getList(String display) {
        return ParkModel.retrieveList(display);
    }
//
//    String get_Last_Name(int index) {
//        return studentList.getStudents().get(index).getLastName();
//    }
//
//    double get_gpa(int index) {
//        return studentList.getStudents().get(index).getGpa();
//    }
//
//    int getListSize() {
//        return studentList.getStudents().size();
//    }
//
//    void delete(int index) {
//        studentList.getStudents().remove(index);
//    }
//
//    void new_Student (){
//    studentList.addStudent();
//    }
//
//    void saveChanges (String fn, String ln, String gpa,int index){
//    studentList.change_Student(fn, ln, gpa, index);
//    }
//    
    
//    private QueueUI QueueUI = null;
//    String status;
//    
//    /**
//     * Constructor for the QuickServiceRestaurant
//     */
//    public QueueCntl() {
//        status = "none";
//    }
//    
//     /**
//     * Gets current ride waiting time.
//     * @param rideName the selected ride user wants to see the wait time for.
//     * @return ride's wait time
//     */   
//    public int getRideTime(String rideName){       
//        return 0;
//    }
//    
//     /**
//     * Gets current ride waiting time.
//     * @param restaurantName the selected ride user wants to see the wait time for.
//     * @return restaurant's wait time
//     */   
//    public int getRestaurantTime(String restaurantName){       
//        return 0;
//    }
}
