package com.minutes.springboot.learnjpaandhibernate.springJpa;

import com.minutes.springboot.learnjpaandhibernate.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringJpaRepository extends JpaRepository<Course,Long> {

    //User defined methods
    public Course findByAuthor(String author);


}
