package com.springboothasrole.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboothasrole.demo.model.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
    User findByEmail(String email);

}

