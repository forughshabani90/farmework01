package com.test04.site.controller;

import com.test04.site.Repository.ColorRepository;
import com.test04.site.model.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ColorController {
    @Autowired
    public ColorRepository colorRepository;
    @GetMapping
    public List<Color> color(){
        return colorRepository.findAll();
    }
public Color save(@RequestBody Color color){
        return colorRepository.save(color);
}

}
