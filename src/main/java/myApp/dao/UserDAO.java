package myApp.dao;

import myApp.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getListUsers();

    void deleteUserById(long id);

    void addUser(User user);

    void updateUser(long id, User user);

    User getUserById(long id);

}
