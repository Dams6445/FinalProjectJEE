package com.example.ademo3;

import com.example.ademo3.util.HibernateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class Ademo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ademo3Application.class, args);
    }

    EntityManager entityManager =  HibernateUtils.getEntityManager();

}
