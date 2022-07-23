package com.maxwell.security.services.inter;

import com.maxwell.security.model.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User user);

}
