/**
 * Created by Катя on 10.12.2016.
 */
public class Controller {
    public API apis[] = new API[3];

    public Controller() {
        this.apis[0] = new BookingComAPI();
        this.apis[1] = new GoogleAPI();
        this.apis[2] = new TripAdvisorAPI();

    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        int count =0;
        for(API api:apis){
            count=count+api.findRooms(price, persons, city, hotel).length;
        }



        Room[] roomRequested = new Room[count];
        int index=0;

        for (API api: apis) {
            for(Room r: api.findRooms(price,persons,city,hotel)){
                roomRequested[index]=r;
                index++;
            }

        }
        return roomRequested;
    }

    Room[] check(API api1, API api2){

        int count=0;


        Room[] api1room = api1.findRooms();
        Room[] api2room = api2.findRooms();
        for(Room api1r:api1room){
            for(Room api2r:api2room){
                if (api1r.equals(api2r))
                {

                    count++;
                }

            }
        }
        Room[] checked = new Room[count];
        int index=0;
        for (Room api1r:api1room) {

            for(Room api2r:api2room) {
                if (api1r.equals(api2r))
                {

                    checked[index]=api1r;
                    index++;
                }
            }
        }
        return checked;
    }

}
