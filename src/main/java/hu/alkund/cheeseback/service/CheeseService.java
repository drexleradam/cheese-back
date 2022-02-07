package hu.alkund.cheeseback.service;

import hu.alkund.cheeseback.model.Cheese;
import hu.alkund.cheeseback.repository.CheeseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheeseService {

    public CheeseService(CheeseRepository cheeseRepository) {
        this.cheeseRepository = cheeseRepository;
    }

    private final CheeseRepository cheeseRepository;

    public List<Cheese> findAll() {
        return cheeseRepository.findAll();
    }

    public Cheese findById(int id) {
        return cheeseRepository.findById(id);
    }

    public Cheese save(Cheese cheese) {
        return cheeseRepository.save(cheese);
    }

    public void deleteById(int id) {
        cheeseRepository.deleteById(id);
    }

}