/**
 * Created by Катя on 10.12.2016.
 */
public class DAOImpl implements DAO {
    public DAOImpl() {
    }

    @Override
    public Room save(Room room) {
        System.out.println("save");
        System.out.println(room.toString());
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("delete");
        System.out.println(room.toString());

        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("update");
        System.out.println(room.toString());

        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("findById");
        System.out.println(id);
        return null;
    }
}
