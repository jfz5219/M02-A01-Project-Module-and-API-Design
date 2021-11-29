package ParkStatistics;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Application for filtering events
 * @author sqn5232
 */

public class ParkEvent {

    private static final String String = null;
    private static final LocalDate LocalDate = null;

    public static void main ( String[] args ) {
        ParkEvent app = new ParkEvent(String, LocalDate, LocalDate);
        app.eventList();
    }

    //Constructor
    private java.lang.String eventTitle;
    private java.time.LocalDate startDate;
    private java.time.LocalDate endDate;
    
    public ParkEvent ( String eventTitle , LocalDate startDate , LocalDate endDate ) {
        this.eventTitle = eventTitle;
        this.startDate = startDate;
        this.endDate = endDate;
    }

     
        //Listing park events
        private void eventList () {
            List< ParkEvent > events = new ArrayList<>();
            events.add( new ParkEvent( "Fright Night" , java.time.LocalDate.of( 2021 , Month.OCTOBER, 17 ) , java.time.LocalDate.of( 2021 , Month.OCTOBER , 31 ) ) );

            LocalDate selectedDate = java.time.LocalDate.of( 2021 , Month.OCTOBER , 29 );
            List< ParkEvent > hits = new ArrayList<>( events.size() );
            for ( ParkEvent event : events ) {
                if ( event.contains( selectedDate ) ) {
                    hits.add( event );
                }
            }
            System.out.println( hits );
        }

        //filtering events by date
        public boolean contains ( LocalDate localDate ) {
            boolean x = ( ! localDate.isBefore( this.startDate ) ) && localDate.isBefore( this.endDate );
            return x;
        }

        //Print out filtered Event Dates
        @Override
        public String toString () {
         return "Park Event{ " +
                "Name of Event:'" + eventTitle + '\'' +
                "| Event starts on:" + startDate +
                "| Event ends on:" + endDate +
                " }";
        }

    
}//end class ParkEvent
