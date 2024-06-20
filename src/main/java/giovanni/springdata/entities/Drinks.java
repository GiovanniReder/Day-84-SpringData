package giovanni.springdata.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Drinks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int calories;
    private double price;


    public Drinks(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }




}
