package com.learnSpringBoot.in28minutes.RestAPIWithJpa.User;

import com.learnSpringBoot.in28minutes.RestAPIWithJpa.Jpa.UserRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class UserResourceController {
    private UserRepo repository;
    private UserDaoService service;

    public UserResourceController(UserDaoService service,UserRepo repository) {
        this.service = service;
        this.repository=repository;
    }

    //Retrieve all users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    //retrieve a given user and provided other details(link) related
    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id) {
        // Call a service method to retrieve a user by ID
        User user = service.findOne(id);

        // Create an EntityModel for the retrieved user
        EntityModel<User> entityModel = EntityModel.of(user); //EntityModel: It is a generic class provided by Spring HATEOAS. It is designed to wrap a domain object (in this case, a User object) and include hypermedia links.

        // Create a link to the method that retrieves all users
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());

        // Add the link to the EntityModel with the relation "all-users"
        entityModel.add(link.withRel("all-users"));

        // Return the EntityModel containing the user and the link
        return entityModel;
    }
    //Create a user
    //@RequestBody annotation tells Spring to look for the data in the HTTP request body and convert it into a User object.
    @PostMapping("/users")
    public void createUser(@Valid @RequestBody User user){
        service.saveUser(user);
    }

    //Remove a user
    @DeleteMapping("/users/{id}")
    public void DeleteUser(@PathVariable int id){
        service.DeleteOneById(id);
    }
}
