package com.example.BlogSystem.services;

import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class UserServiceStubImpl implements UserService {
	@Override
    public boolean authenticate(String username, String password) {
         // Provide a sample password check: username == password
         return Objects.equals(username, password);
    }
}
