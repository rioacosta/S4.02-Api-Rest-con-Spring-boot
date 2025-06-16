package cat.itacademy.s04.t02.n03.services;


import cat.itacademy.s04.t02.n03.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.model.Fruit;
import cat.itacademy.s04.t02.n03.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {
    @Autowired
    private FruitRepository repository;

    public Fruit addFruit(Fruit fruit) {
        return repository.save(fruit);
    }

    public List<Fruit> getAll() {
        return repository.findAll();
    }

    public Fruit getOne(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit not found with ID: " + id));
    }

    public Fruit getByName(String name) {
       return repository.findByName(name)
                       .orElseThrow(() -> new FruitNotFoundException("Fruit not found with name: " + name));
    }

    public Fruit updateFruit(Fruit fruit) {
        if (!repository.existsById(fruit.getId())) {
            throw new FruitNotFoundException("Fruit not found with ID: " + fruit.getId());
        }
        return repository.save(fruit);
    }

    public void deleteFruit(String id) {
        if (!repository.existsById(id)) {
            throw new FruitNotFoundException("Fruit not found with ID: " + id);
        }
        repository.deleteById(id);
    }

}
