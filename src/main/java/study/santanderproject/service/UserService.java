package study.santanderproject.service;

import study.santanderproject.model.User;

public interface UserService {
    User findById(Long id);

//    User findByUsername(String username);

    User create(User user);
}
