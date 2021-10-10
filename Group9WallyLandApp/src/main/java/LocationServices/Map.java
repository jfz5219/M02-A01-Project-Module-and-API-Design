
package LocationServices;

import java.util.ArrayList;
import javax.swing.JFrame;


public class Map extends Attractions {
    
    /**
     * This method is designed to set the basic visual properties of the WallyLand Map 
     * @param title: String used to store the title of the map 
     * @param subSections: ArrayList of Strings used to display the names of various map subsections
     * @param attractionNames: ArrayList of Strings used to display the names of nearby attractions on the map
     * @param attractionIcons: ArrayList of Icon objects used to display the relevant icon for the nearby attraction
     */
    public static void setMapProperties(String title, ArrayList<String> subSections, 
            ArrayList<String> attractionNames, ArrayList<Object> attractionIcons) {
        /*
        TODO: 
        Implement settting functionality 
        Define Icon object 
        */
        title = "WallyLand";
        subSections.add("Section1");
        subSections.add("Section2");
        subSections.add("Section3");
        attractionNames.add("Space Mountain");
        attractionNames.add("Pirates of the Carribean");
        attractionNames.add("Micky Mouse Clubhouse");
        Object icon1 = "icon1"; 
        Object icon2 = "icon2";
        attractionIcons.add(icon1);
        attractionIcons.add(icon2);
         
    }
    
    /**
     * This method renders the map with the properties defined in setMapProperties
     * @return Returns a JFrame Object called mapFrame that renders the map and its features 
     */
    public JFrame renderMap() {
        /*
        TODO: 
        implement render map functionallity 
        mapFrame = setMapProperties();   ??
        */
        JFrame mapFrame = new JFrame();
        return mapFrame;
    }
    
    
}
