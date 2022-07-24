package com.raisetech.reisetechem.controller;

import com.raisetech.reisetechem.mapper.MaterialsMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChemController {
    private MaterialsMapper materialsMapper;

    @Autowired
    public ChemController(MaterialsMapper materialsMapper) {
        this.materialsMapper = materialsMapper;
    }

    @GetMapping("/materials")
    public String get(Model model) {
        model.addAttribute("materials", materialsMapper.findAll());
        return "/materials";
    }

}
