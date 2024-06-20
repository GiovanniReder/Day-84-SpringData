package giovanni.springdata.entities;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Menu {
    private List<Pizza> pizze;
    private List<Drinks> drinks;
    private List<Toppings> toppings;





    public Menu(List<Pizza> pizze, List<Toppings> toppings, List<Drinks> drinks) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }



    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", drinks=" + drinks +
                ", toppings=" + toppings +
                '}';
    }


    public void getMenu(){

        System.out.println("--------MENU-------");
        System.out.println(" ");
        System.out.println("--------PIZZE-------");
        for (Pizza pizza: pizze){
            System.out.println(pizza);
        }
        System.out.println("--------DRINKS-------");
        for (Drinks drinks: drinks){
            System.out.println(drinks);
        }
        System.out.println("--------TOPPINGS-------");
        for (Toppings toppings : toppings){
            System.out.println(toppings);
        }
    }
}
