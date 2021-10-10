package testharness;
package EmployeePortal;
import java.util.ArrayList;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.Test;

public class mainDriver {
    
    @Test (expected=NullPointerException.class)
    public void getAttractionsTest() {
        String attraction = null;
        ArrayList<String> attractionList = new ArrayList<>();
        attractionList.add("Needs");
        attractionList.add("to");
        attractionList.add("be");
        attractionList.add("implemented");
        for (int i=0; i > attractionList.size(); i++) {
             attraction = attractionList.get(i);
        }
        boolean equals;
        equals = attraction.equals("Needs to be implemented");
        
        
    }
    
    
    
    
    
    /**
     * This main method is the main driver for our program 
     * @param args 
     */
    public static void main(String[] args) {
        
    }
}
