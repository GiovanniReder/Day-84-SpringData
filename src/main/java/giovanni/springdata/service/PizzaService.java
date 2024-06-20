package giovanni.springdata.service;

import giovanni.springdata.entities.Pizza;
import giovanni.springdata.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public void savePizza(Pizza newPizza){
        pizzaRepository.save(newPizza);
        System.out.println("La pizza " + newPizza + " è stata salvata correttamente nel db");
    }
}
