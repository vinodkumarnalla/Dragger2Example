package modals;

/**
 * Created by vinu on 11/11/17.
 */

public class User {
    private String name;
    private String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public String getPlace() {
        return place;

    }

    public void setPlace(String place) {
        this.place = place;
    }
}
