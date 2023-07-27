package myApp.server;

import myApp.model.User;

import java.util.List;

public interface UserService {

    List<User> getListUsers();

    void deleteUserById(long id);

    void addUser(User user);

    void updateUser(long id, User user);

    User getUserById(long id);

}
