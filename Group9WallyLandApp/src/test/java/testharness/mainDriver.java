package testharness;
import EmployeePortal.UpdateQueueModel;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import main.java.RealTimeInfo.ParkEvent;
import static org.junit.Assert.assertEquals;
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
    
    
    
    
    
  static private ParkEvent myEvents;
private static final String String = null;
private static final LocalDate LocalDate = null;
    
    public static void main(String[] args) {
        
        System.out.println("Running ALL testharness test stubs......");

        ParkEvent app = new ParkEvent(String, LocalDate, LocalDate);
        eventList();
                
        System.out.println("");
       
        System.out.println("The End...  finished ALL test stubs for all packages-classes-methods");
    }
    public static void eventList () {
            ArrayList< ParkEvent > events = new ArrayList<>();
            events.add( new ParkEvent( "Christmas Spectuacular" , java.time.LocalDate.of( 2021 , Month.DECEMBER, 17 ) , java.time.LocalDate.of( 2021 , Month.JANUARY, 1 ) ) );
            events.add( new ParkEvent( "Fright Night" , java.time.LocalDate.of( 2021 , Month.OCTOBER, 17 ) , java.time.LocalDate.of( 2021 , Month.OCTOBER , 31 ) ) );
            
            
            for (ParkEvent event : events) {
            System.out.println(event.toString());

        }
}
	@Test
	public void getCredentialsTest(){
		// todo: get credentials from user input
		String username = "to be";
		String password = "implemented";
		ArrayList<String> credentialsList = new ArrayList<>();
		credentialsList.add(username);
		credentialsList.add(password);
		// function to authenticate user input
//		validateFuncToImplement(credentialsList);
		// if valid, update view and continue
	}
        
        @Test
        public void updateDataTest() throws IOException{   
        String expected = "Update Sucessful";
        float enterNum = (float) 6.0;
        float exitNum = (float) 7.5;
        String actual = UpdateQueueModel.updateData("Ride 1", enterNum, exitNum);
        assertEquals(expected, actual);
        }
        

}