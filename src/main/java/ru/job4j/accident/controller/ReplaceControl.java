package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

@Controller
public class ReplaceControl {
    private final AccidentMem accidents;

    public ReplaceControl(AccidentMem accidents) {
        this.accidents = accidents;
    }

    @GetMapping("/edit")
    public String create() {
        return "replace/edit";
    }

    @PostMapping("/replace")
    public String create(@ModelAttribute Accident accident, Model model) {
        accidents.update(accident);
        model.addAttribute("accidents", accidents.getAccidents());
        return "index";
    }

}
