package giovanni.springdata;

import giovanni.springdata.entities.*;
import giovanni.springdata.enums.OrderStateEnum;
import giovanni.springdata.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;
    @Autowired
    private PizzaService pizzaService;







    @Override
    public void run(String... args) throws Exception {
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringdataApplication.class)) {


/*
            Table table = (Table) ctx.getBean("getTable");
            Order order = new Order(1, table, OrderStateEnum.IN_CORSO, 4, 20);
            System.out.println("-------APPLICAZIONE INIZIALIZZATA DAL RUNNER------- ");

            order.addPizza(ctx.getBean("margherita", Pizza.class));
            order.addPizza(ctx.getBean("margherita", Pizza.class));
            order.addPizza(ctx.getBean("salami", Pizza.class));
            order.addPizza(ctx.getBean("hawaiana", Pizza.class));

            order.addDrink(ctx.getBean("water", Drinks.class));
            order.addDrink(ctx.getBean("water", Drinks.class));
            order.addDrink(ctx.getBean("lemonade", Drinks.class));
            order.addDrink(ctx.getBean("wine", Drinks.class));

            System.out.println(order);

            menu.getMenu();
*/
            Toppings cheese = new Toppings("cheese" , 120 , 0.99);
            List<Toppings> marghTps = new ArrayList<>();
            marghTps.add(cheese);
            Pizza margh = new Pizza("margherita" , 5.99 , 700 ,marghTps);
            pizzaService.savePizza(margh);

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }



    }
}