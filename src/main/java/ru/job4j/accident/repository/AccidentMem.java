
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

    public void createTemporaryData() {
        accidents.put(1, Accident.of(1, "Accident 1", "text 1", "Address 1"));
        accidents.put(2, Accident.of(2, "Accident 2", "text 2", "Address 2"));
        accidents.put(3, Accident.of(3, "Accident 3", "text 3", "Address 3"));
    }
}
