package com.arjoo.exceptions;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        List<User> users = Arrays.asList(new User(100, "Arjoo"));
        User user = users.stream()
                .filter(u -> u.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("Hi.. User not found"));
        return user;
    }
}
