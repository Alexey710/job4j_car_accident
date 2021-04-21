package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.repository.AccidentMem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import ru.job4j.accident.model.Rule;

@Controller
public class AccidentControl {
    private final AccidentMem accidents;

    public AccidentControl(AccidentMem accidents) {
        this.accidents = accidents;
    }

    @GetMapping("/create")
    public String create(Model model) {
        List<AccidentType> types = new ArrayList<>();
        types.add(AccidentType.of(1));
        types.add(AccidentType.of(2));
        types.add(AccidentType.of(3));
        model.addAttribute("types", types);
        
        List<Rule> rules = new ArrayList<>();
        rules.add(Rule.of(1));
        rules.add(Rule.of(2));
        rules.add(Rule.of(3));
        model.addAttribute("rules", rules);

        return "accident/create";
    }
    
    @PostMapping("/saveName")
    public String saveName(
            @ModelAttribute Accident accident, Model model) {
        
        Accident accidentNewName = accidents.findById(accident.getId());
        accidentNewName.setName(accident.getName());
       
        accidents.create(accidentNewName);
     
        model.addAttribute("accidents", accidents.getAccidents());
        return "index";
    }
    
    @PostMapping("/save")
    public String save(
            @RequestParam(value = "type_id", required = false) Integer typeId,
            @ModelAttribute Accident accident, 
            Model model,
            HttpServletRequest req) {
        
        if (typeId != null) {
            accident.setType(AccidentType.of(typeId));
        }
        accidents.create(accident);
        String[] ids = req.getParameterValues("rIds");
        System.out.println("String[] ids =>" + Arrays.toString(ids));
        Set<Rule> rules = new HashSet<>();
        for(String id : ids) {
            rules.add(Rule.of(Integer.parseInt(id))); 
        }
        System.out.println("SAVE SETrules =>" + rules);
        accident.setRules(rules);
      
        model.addAttribute("accidents", accidents.getAccidents());
        return "index";
    }

    @GetMapping("/edit")
    public String update(@RequestParam("id") int id, Model model) {
        model.addAttribute("accident", accidents.findById(id));
        return "replace/edit";
    }
}
