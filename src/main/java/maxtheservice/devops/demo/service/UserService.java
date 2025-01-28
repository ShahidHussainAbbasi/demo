package maxtheservice.devops.demo.service;


import java.util.List;

import maxtheservice.devops.demo.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    void deleteUser(Long userId);
}
