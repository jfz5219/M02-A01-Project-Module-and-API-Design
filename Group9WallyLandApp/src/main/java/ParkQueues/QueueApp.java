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
public class QueueApp {
     static private QueueUI QueueUI;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        javax.swing.SwingUtilities.invokeLater(() -> {
        QueueCntl cntl = new QueueCntl();
        });
    } 
}
    

