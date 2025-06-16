package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    private FruitService service;

    @PostMapping("/add")
    public ResponseEntity<Fruit> add(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(service.addFruit(fruit));
    }

    @GetMapping("/getAll")
    public List<Fruit> getAll() {
        return service.getAll();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOne(@PathVariable int id) {
        Fruit fruit = service.getOne(id);
        return fruit != null ? ResponseEntity.ok(fruit) : ResponseEntity.notFound().build();
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> update(@RequestBody Fruit fruit) {
        Fruit updatedFruit = service.updateFruit(fruit);
        return updatedFruit != null ? ResponseEntity.ok(updatedFruit) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        Fruit fruit = service.getOne(id);
        if (fruit != null) {
            service.deleteFruit(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
