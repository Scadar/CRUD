package ru.scadarnull.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.scadarnull.crud.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {
}
