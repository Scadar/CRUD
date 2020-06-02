package ru.scadarnull.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scadarnull.crud.entity.Person;
import ru.scadarnull.crud.repo.PersonRepo;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public List<Person> findAll(){
        return personRepo.findAll();
    }

    public void save(Person person){
        personRepo.save(person);
    }

    public void delete(Person person){
        personRepo.delete(person);
    }

}
