package com.arjoo.exceptions;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        if(id == 100) {
            return new User(100, "Arjoo");
        }else {
            throw new UserNotFoundException("User not found!!");
        }
    }
}
