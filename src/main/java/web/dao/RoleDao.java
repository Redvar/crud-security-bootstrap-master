package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.models.Role;

//@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Role getRoleByName(String name);
    boolean existsByName(String roleName);
    Role getRoleById(Long id);
}
