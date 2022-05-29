package web.service;

import web.models.Role;
import web.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    void save(User user);
    void update(User user);
    void delete(User user);
    User findUserByUsername(String username);

}
