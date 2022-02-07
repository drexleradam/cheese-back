package hu.alkund.cheeseback.repository;

import hu.alkund.cheeseback.model.Cheese;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CheeseRepository  {


    public List<Cheese> findAll() {
        List<Cheese> list = new ArrayList<>();
        list.add(Cheese.builder().id(1).build());
        return list;
    }

    public Cheese findById(int id) {
        return null;
    }

    public void deleteById(int id) {

    }

    public Cheese save(Cheese cheese) {
        return null;
    }
}
