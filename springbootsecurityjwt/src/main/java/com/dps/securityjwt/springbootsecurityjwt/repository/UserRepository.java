package com.dps.securityjwt.springbootsecurityjwt.repository;

import com.dps.securityjwt.springbootsecurityjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
