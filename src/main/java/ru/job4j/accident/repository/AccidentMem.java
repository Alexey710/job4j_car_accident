
package ru.job4j.accident.repository;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

@Repository
public class AccidentMem {
    private final Map<Integer, Accident> accidents = new HashMap<>();

    public Map<Integer, Accident> getAccidents() {
        return accidents;
    }

    public void create(Accident accident) {
        accidents.put(accident.getId(), accident);
    }

    public void update(Accident accident) {
        accidents.replace(accident.getId(), accident);
    }

    public Accident findById(int id) {
        return accidents.get(id);
    }

    @Override
    public String toString() {
        return "AccidentMem{" + "accidents=" + accidents + '}';
    }
}
