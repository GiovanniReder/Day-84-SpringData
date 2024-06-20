package giovanni.springdata.entities;

import giovanni.springdata.enums.OrderStateEnum;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private long orderId;

    private Table tavolo;
    // @Enumerated(EnumType.STRING)
    private OrderStateEnum orderState;
    private int placeSettings;
    private double acquisitionTime;
    private List<Pizza> pizzas;
    private List<Drinks> drinks;
    private List<Toppings> toppings;

    public Order(long orderId, Table tavolo, OrderStateEnum orderState, int placeSettings, double acquisitionTime) {
        this.orderId = orderId;
        this.tavolo = tavolo;
        this.orderState = orderState;
        this.placeSettings = placeSettings;
        this.acquisitionTime = acquisitionTime;
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.toppings = new ArrayList<>();

    }




    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
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

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public double getAcquisitionTime() {
        return acquisitionTime;
    }

    public void setAcquisitionTime(double acquisitionTime) {
        this.acquisitionTime = acquisitionTime;
    }

    public int getPlaceSettings() {
        return placeSettings;
    }

    public void setPlaceSettings(int placeSettings) {
        this.placeSettings = placeSettings;
    }

    public OrderStateEnum getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderStateEnum orderState) {
        this.orderState = orderState;
    }

    public Table getTavolo() {
        return tavolo;
    }

    public void setTavolo(Table tavolo) {
        this.tavolo = tavolo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", tavolo=" + tavolo +
                ", orderState=" + orderState +
                ", placeSettings=" + placeSettings +
                ", acquisitionTime=" + acquisitionTime +
                ", pizzas=" + pizzas +
                ", drinks=" + drinks +
                ", toppings=" + toppings +
                '}';
    }
    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }
    public void addDrink(Drinks drink) {
        this.drinks.add(drink);
    }
    public void addTopping(Toppings topping) {
        this.toppings.add(topping);
    }

}