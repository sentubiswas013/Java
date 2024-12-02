package demo_01.com.example.demo_01.service;

import demo_01.com.example.demo_01.model.User;
import demo_01.com.example.demo_01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Create or Update User
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User By ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Delete User By ID
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
