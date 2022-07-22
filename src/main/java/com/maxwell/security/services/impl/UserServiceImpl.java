package com.maxwell.security.services.impl;

import com.maxwell.security.model.entities.User;
import com.maxwell.security.repositories.UserRepository;
import com.maxwell.security.services.inter.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
