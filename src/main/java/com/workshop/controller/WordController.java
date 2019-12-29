package com.workshop.controller;

import com.workshop.dao.WordDao;
import com.workshop.entities.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class WordController {

    @Autowired
    private WordDao wordDao;

    @GetMapping("/word")
    public String word(@RequestParam(name = "id", defaultValue = "1") Integer id,
                       Model model) {
        Optional<Word> tempWord = wordDao.findById(id);
        Word word = tempWord.get();
        model.addAttribute("word", word);
        System.out.println(word);
        return "word";
    }

    @GetMapping("/word/{id}")
    public String getWord(@PathVariable("id") Integer id,
                          Model model) {
        Integer num = (int) wordDao.count();
        if (id <= 0) {
            id = 1;
        }
        if (id > num) {
            id = num;
        }
        Optional<Word> tempWord = wordDao.findById(id);
        Word word = tempWord.get();
        model.addAttribute("word", word);
        return "word";
    }



}
