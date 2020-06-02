package ru.scadarnull.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.scadarnull.crud.repo.PersonRepo;

@SpringBootApplication
public class CrudApplication {

    @Autowired
    private PersonRepo personRepo;

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

}
