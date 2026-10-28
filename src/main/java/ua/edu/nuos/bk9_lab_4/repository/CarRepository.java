package ua.edu.nuos.bk9_lab_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.nuos.bk9_lab_4.data.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
