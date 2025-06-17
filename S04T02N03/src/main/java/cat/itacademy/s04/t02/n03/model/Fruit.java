package cat.itacademy.s04.t02.n03.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Document(collection = "fruit")
public class Fruit {
    @Id
    private String id;
    private String name;
    private int amountKilos;

    public Fruit (String name, int amountKilos) {
        this.name = name;
        this.amountKilos = amountKilos;
    }

}
