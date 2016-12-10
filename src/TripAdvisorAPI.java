import java.util.Date;

/**
 * Created by Катя on 10.12.2016.
 */
public class TripAdvisorAPI implements API {
    Room[] rooms=new Room[5];;

    public TripAdvisorAPI() {
        Date date1 = new Date (11,11,11);
        Date date2 = new Date (13,11,11);
        Date date3 = new Date (10,11,11);
        Date date4 = new Date (9,11,11);
        rooms[0]= new Room(105,124,2,date1,"LuxuryLife","Chicago");
        rooms[1]= new Room(106,130,2,date2,"KingsHome","LA");
        rooms[2]= new Room(108,140,3,date3,"LittlePonny","Boston");
        rooms[3]= new Room(109,135,3,date3,"DukeHotel","Orlando");
        rooms[4]= new Room(110,120,2,date4,"BigAppleSuit","NewYork");

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count=0;

        for (Room r: findRooms()) {

            if (r.getPrice() == price
                    && r.getPersons() == persons
                    && r.getCityName().equals(city)
                    ) {
                count++;
            }
        }
        Room[] roomRequested = new Room[count];
        int index=0;
        for (Room r: findRooms()) {

            if (r.getPrice() == price
                    && r.getPersons() == persons
                    && r.getCityName().equals(city)
                    ) {
                roomRequested[index]=r;
                index++;
            }
        }

        return roomRequested;

    }
    @Override
    public Room[] findRooms() {
        return  rooms;
    }
}
