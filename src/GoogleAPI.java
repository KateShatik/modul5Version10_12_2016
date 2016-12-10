import java.util.Date;

/**
 * Created by Катя on 10.12.2016.
 */
public class GoogleAPI implements API {
    Room[] rooms=new Room[5];;

    public GoogleAPI() {
        Date date1 = new Date (11,11,11);
        Date date2 = new Date (13,11,11);
        Date date3 = new Date (10,11,11);
        Date date4 = new Date (9,11,11);
        rooms[0]= new Room(105,124,2,date4,"LuxuryLife","Chicago");
        rooms[1]= new Room(106,130,2,date1,"KingsHome","LA");
        rooms[2]= new Room(107,120,3,date2,"BigBoss","Washington");
        rooms[3]= new Room(103,135,3,date1,"KingsHouse","Boston");
        rooms[4]= new Room(104,110,2,date3,"LordsSuits","NewYork");

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
