package web.service;

import web.models.Role;

import java.util.List;

public interface RoleService {
    Role getRoleById(Long id);
    List<Role> getAllRoles();
    void save(Role role);
    Role getRoleByName(String name);
}
