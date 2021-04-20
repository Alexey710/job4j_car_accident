
package ru.job4j.accident.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        AccidentMem accidents = new AccidentMem();
        Map<Integer, Accident> map =  accidents.getAccidents();
        model.addAttribute("accidents", map);
        return "index";
    }
}
