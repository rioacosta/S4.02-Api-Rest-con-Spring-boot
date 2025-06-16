package cat.itacademy.s04.t02.n01.model;

import jakarta.persistence.*;


@Entity
@Table(name = "fruit")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int amountKilos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountKilos() {
        return amountKilos;
    }

    public void setAmountKilos(int amountKilos) {
        this.amountKilos = amountKilos;
    }

}
