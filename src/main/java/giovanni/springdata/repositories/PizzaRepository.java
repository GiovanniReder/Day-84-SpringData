package giovanni.springdata.repositories;

import giovanni.springdata.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza , Long> {
    List<Pizza> findByname(String name);
}
