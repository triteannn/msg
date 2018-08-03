package ro.msg.edu.jbugs.userManagement.persistence.dao;

import ro.msg.edu.jbugs.userManagement.persistence.entity.Role;
import ro.msg.edu.jbugs.userManagement.persistence.entity.User;

import javax.ejb.Remote;
import java.io.Serializable;
import java.util.List;

@Remote
public interface UserPersistenceManager extends Serializable {

    void addUser(User user);

    User updateUser(User user);

    List<User> getAllUsers();

    User getUserForUsername(String username);

    void addRole(Role role);

    void removeRole(Role role);

    Role updateRole(Role role);

    Role getRoleForId(long id);

    List<Role> getAllRoles();

    List<User> getUserByEmail(String email);

    List<String> findUsersNameStartingWith(String username);
}
