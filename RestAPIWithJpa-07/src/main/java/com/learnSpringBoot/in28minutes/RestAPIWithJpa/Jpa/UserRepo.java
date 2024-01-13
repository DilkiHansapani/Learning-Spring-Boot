package com.learnSpringBoot.in28minutes.RestAPIWithJpa.Jpa;

import com.learnSpringBoot.in28minutes.RestAPIWithJpa.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Integer> {

}
