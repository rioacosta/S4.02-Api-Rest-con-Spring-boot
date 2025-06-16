package cat.itacademy.s04.t02.n03.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruita")
public class Fruit {
    @Id
    private String id;
    private String name;
    private int amountKilos;

    public Fruit () {
    }
    public Fruit (String name, int amountKilos) {
        this.name = name;
        this.amountKilos = amountKilos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
