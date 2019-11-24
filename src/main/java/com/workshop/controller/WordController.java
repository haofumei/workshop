package com.workshop.controller;

import com.workshop.mapper.WordMapper;
import com.workshop.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WordController {

    @Autowired
    private WordMapper wordMapper;

    @GetMapping("/word")
    public String word(@RequestParam(name = "id", defaultValue = "1") Integer id,
                       Model model) {
        Word word = wordMapper.findById(id);
        model.addAttribute("word", word);
        return "word";
    }

    @GetMapping("/word/{id}")
    public String getWord(@PathVariable("id") Integer id,
                          Model model) {
        Integer num = wordMapper.count();
        if (id <= 0) {
            id = 1;
        }
        if (id > num) {
            id = num;
        }
        Word word = wordMapper.findById(id);
        model.addAttribute("word", word);
        return "word";
    }


}
