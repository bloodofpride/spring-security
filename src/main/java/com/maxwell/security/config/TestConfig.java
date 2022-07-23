package com.maxwell.security.config;

import com.maxwell.security.model.entities.User;
import com.maxwell.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@Profile("test")
@Configuration
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "maxwell_ponte", passwordEncoder.encode("12345"));
        User u2 = new User(null, "mairlon_ponte", passwordEncoder.encode("54321"));
        User u3 = new User(null, "marcos_ponte", passwordEncoder.encode("12345"));

        userRepository.saveAll(Arrays.asList(u1,u2,u3));
    }
}
