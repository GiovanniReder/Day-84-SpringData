package giovanni.springdata;

import giovanni.springdata.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {

    @Bean(name = "margherita")
    public Pizza getMargherita(){
        List<Toppings> toppingsLista = new ArrayList<>();
        toppingsLista.add(getCheese());
        return new Pizza("Margherita" , 4.99 , 1104 , toppingsLista );
    }

    @Bean(name = "hawaiana" )
    public Pizza getHawaiana(){
        List<Toppings> toppingsLista = new ArrayList<>();
        toppingsLista.add(getCheese());
        toppingsLista.add(getHam());
        toppingsLista.add(getPineapple());
        return new Pizza("Hawaiian", 6.49 , 1024 , toppingsLista);
    }

    @Bean(name = "salami" )
    public Pizza getSalami(){
        List<Toppings> toppingsLista = new ArrayList<>();
        toppingsLista.add(getCheese());
        toppingsLista.add(getSalame());
        return new Pizza("Salami", 5.99 , 1160 , toppingsLista );
    }



    @Bean(name = "lemonade")
    public Drinks getLemonade(){
        return new Drinks("Lemonade" , 1.29 , 128);
    }
    @Bean(name = "water")
    public Drinks getWater(){
        return new Drinks("water" , 1.29 , 0);
    }
    @Bean(name = "wine")
    public Drinks getWine(){
        return new Drinks("Wine" , 7.49 , 609);
    }


    @Bean
    public Toppings getCheese(){
        return new Toppings("cheese" , 92 , 0.69);
    }
    @Bean
    public Toppings getHam(){
        return new Toppings("ham" , 35 , 0.99);
    }
    @Bean
    public Toppings getOnions(){
        return new Toppings("onions" , 22 , 0.69);
    }
    @Bean
    public Toppings getPineapple(){
        return new Toppings("pineapple" , 24 , 0.79);
    }
    @Bean
    public Toppings getSalame(){
        return new Toppings("salame" , 86 , 0.99);
    }

    @Bean
    public Menu menu(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drinks> drinkList = new ArrayList<>();
        List<Toppings> toppingsList = new ArrayList<>();

        pizzaList.add(getMargherita());
        pizzaList.add(getHawaiana());
        pizzaList.add(getSalami());

        drinkList.add(getLemonade());
        drinkList.add(getWine());
        drinkList.add(getWater());

        toppingsList.add(getCheese());
        toppingsList.add(getSalame());
        toppingsList.add(getHam());
        toppingsList.add(getPineapple());
        return new Menu(pizzaList ,  toppingsList , drinkList);
    }
    @Bean
    Table getTable (@Value("${costo.coperto}") double coperto){
        return new Table( 1 ,5 , true);
    }

    @Bean
    public double getCoperto(@Value("${costo.coperto}")  double coperto){
        return coperto;
    }



}


