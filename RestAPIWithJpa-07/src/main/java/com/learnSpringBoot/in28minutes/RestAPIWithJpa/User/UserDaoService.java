package com.learnSpringBoot.in28minutes.RestAPIWithJpa.User;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>(); //Create a static empty list call users

    private static int userCount=0;

    static {
        users.add(new User(userCount++,"Default", 0));
        users.add(new User(userCount++,"Sasi", 24));
        users.add(new User(userCount++,"Dilki", 24));
        users.add(new User(userCount++,"Pasi", 16));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    //enter a user in to the users list
    public User saveUser(User user){
        user.setId(userCount++);
        users.add(user);
        return user;
    }

    public void DeleteOneById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
        //return users;
    }
}
