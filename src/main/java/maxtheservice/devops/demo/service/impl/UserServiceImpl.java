package maxtheservice.devops.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import maxtheservice.devops.demo.entity.User;
import maxtheservice.devops.demo.repository.UserRepository;
import maxtheservice.devops.demo.service.UserService;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
    
}
