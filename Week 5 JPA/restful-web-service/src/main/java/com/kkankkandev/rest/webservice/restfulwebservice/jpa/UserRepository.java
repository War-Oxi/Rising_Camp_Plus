package com.kkankkandev.rest.webservice.restfulwebservice.jpa;

import com.kkankkandev.rest.webservice.restfulwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
