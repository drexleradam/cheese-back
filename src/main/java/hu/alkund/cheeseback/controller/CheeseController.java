package hu.alkund.cheeseback.controller;


import hu.alkund.cheeseback.service.CheeseService;
import hu.alkund.cheeseback.model.Cheese;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cheese")
public class CheeseController {

    private final CheeseService cheeseService;

    public CheeseController(CheeseService cheeseService) {
        this.cheeseService = cheeseService;
    }

    @GetMapping
    public List<Cheese> findAll(){
        return cheeseService.findAll();
    }

    @GetMapping("/{id}")
    public Cheese findById(@PathVariable int id){
        return cheeseService.findById(id);
    }

    @PostMapping
    public Cheese create(@RequestBody Cheese toDo){
        return cheeseService.save(toDo);
    }

    @PutMapping("/{id}")
    public Cheese update(@RequestBody Cheese toDo){
        return cheeseService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        cheeseService.deleteById(id);
    }

}
