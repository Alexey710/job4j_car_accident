package ru.job4j.accident.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AccidentType {
    private Integer id;

    private String name;

    public static AccidentType of(Integer id) {
        AccidentType type = new AccidentType();
        type.id = id;
        if (id == 1) {type.name = "Две машины";}
        if (id == 2) {type.name = "Машина и человек";}
        if (id == 3) {type.name = "Машина и велосипед";}
      
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccidentType that = (AccidentType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AccidentType{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}
