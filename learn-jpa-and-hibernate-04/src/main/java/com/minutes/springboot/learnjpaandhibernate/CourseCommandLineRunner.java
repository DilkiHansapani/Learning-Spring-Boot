package com.minutes.springboot.learnjpaandhibernate;

import com.minutes.springboot.learnjpaandhibernate.Course;
import com.minutes.springboot.learnjpaandhibernate.springJpa.SpringJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseCommandLineRunner implements CommandLineRunner {
    //@Autowired
    //private JpaRepository repository;

    @Autowired
    SpringJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {

        repository.save(new Course(1,"Dilki","ABC"));
        repository.save(new Course(2,"Sasi","DBW"));
        repository.save(new Course(3,"Pasi","FGH"));
        repository.save(new Course(4,"Kavi","Ilk"));

        repository.deleteById((long) 2L);
        System.out.println(repository.findByAuthor("ABC"));
        Course course1 = repository.findByAuthor("FGH");
        System.out.println(course1.getName());


    }
}
