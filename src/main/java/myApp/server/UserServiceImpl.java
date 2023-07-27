package myApp.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myApp.dao.UserDAO;
import myApp.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public List<User> getListUsers() {
        return userDAO.getListUsers();
    }

    @Transactional
    @Override
    public void deleteUserById(long id) {
        userDAO.deleteUserById(id);
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    @Override
    public void updateUser(long id, User user) {
        userDAO.updateUser(id, user);
    }

    @Transactional
    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }
}
