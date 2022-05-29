package web.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.models.Role;
import web.models.User;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User findUserByUsername(String username);
    boolean existsByUsername(String username);
}
