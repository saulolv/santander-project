package study.santanderproject.service.impl;

import org.springframework.stereotype.Service;
import study.santanderproject.model.User;
import study.santanderproject.repository.UserRepository;
import study.santanderproject.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

//    @Override
//    public User findByUsername(String name) {
//        return userRepository.findByUsername(name);
//    }

    @Override
    public User create(User user) {
        if(user.getId() != null && userRepository.existsById(user.getId())) {
            throw new IllegalArgumentException("User already exists");
        }
        return userRepository.save(user);
    }
}
