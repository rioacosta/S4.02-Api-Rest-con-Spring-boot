package cat.itacademy.s04.t02.n02.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.s04.t02.n02.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n02.model.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.s04.t02.n02.repository.FruitRepository;

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

    public Fruit getOne(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit not found with ID: " + id));
    }
    public Fruit getByName(String name) {
        Optional<Fruit> fruit = repository.findByName(name);
        return fruit.orElse(null);
    }

    public Fruit updateFruit(Fruit fruit) {
        if (!repository.existsById(fruit.getId())) {
            throw new FruitNotFoundException("Fruit not found with ID: " + fruit.getId());
        }
        return repository.save(fruit);
    }

    public void deleteFruit(int id) {
        if (!repository.existsById(id)) {
            throw new FruitNotFoundException("Fruit not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}
