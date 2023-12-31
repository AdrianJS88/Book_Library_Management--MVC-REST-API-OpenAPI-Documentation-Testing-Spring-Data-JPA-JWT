package com.application.courselibrary.service;

import com.application.courselibrary.entity.Book;
import com.application.courselibrary.entity.User;
import com.application.courselibrary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Long id){
        User user= userRepository.findById( id ).orElseThrow(()-> new RuntimeException("User not found"));
        return user;
    }

    public void createUser(User user){
        userRepository.save(user );
    }
    public void updateUser(User user){
        userRepository.save(user );
    }

    public void deleteUser(Long id){
        User user= userRepository.findById( id ).orElseThrow(()-> new RuntimeException("User not found"));
        userRepository.deleteById( user.getId() );
    }

}
