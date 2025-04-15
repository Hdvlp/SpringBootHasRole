package com.springboothasrole.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.springboothasrole.demo.model.User;
import com.springboothasrole.demo.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    
    public String register(User userToRegister){
        String s = encoder.encode(userToRegister.getPassword());

        userToRegister.setPassword("{bcrypt}"+s);

        int number = 0;
        try
        {
            User newUser =  repo.save(userToRegister) ;
            number = newUser.getId();
        }
        catch (NumberFormatException e)
        {
            number = 0;
        }
        if (number == 0){
            return new String ("Error...");
        }
        return new String ("OK. <a href=\"/login\">Please log in here</a>.");
    }
}

