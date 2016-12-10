/**
 * Created by Катя on 10.12.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    public Room[] findRooms() ;
}
