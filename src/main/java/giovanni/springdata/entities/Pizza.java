package giovanni.springdata.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pizze")
@Getter
@Setter
@ToString

public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pizza_id")
    private List<Toppings> toppingsList = new ArrayList<>();
    private int calories;
    private double price;

    public Pizza(String name, double price, int calories, List<Toppings> toppingsList) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppingsList = toppingsList;

    }









}
