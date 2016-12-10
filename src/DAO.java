/**
 * Created by Катя on 10.12.2016.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
