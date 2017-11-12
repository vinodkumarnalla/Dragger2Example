package modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import modals.Group;
import modals.User;

/**
 * Created by vinu on 11/11/17.
 */
@Module
public class GroupModule {
    @Provides@Singleton
     User getUser(){
        return  new User("name","group");
    }
    @Provides@Singleton
    Group getGroup(){
         return new Group(new User("name","group"));
    }
}
