package Components;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;
import modals.Group;
import modals.User;
import modules.GroupModule;

/**
 * Created by vinu on 11/11/17.
 */
@Singleton@Component(modules = GroupModule.class)
public interface UserComponent {
    Group getGroup();
    User createUser();
}
