package modals;

import javax.inject.Inject;

/**
 * Created by vinu on 11/11/17.
 */

public class Group {
    @Inject
    public Group(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
}
