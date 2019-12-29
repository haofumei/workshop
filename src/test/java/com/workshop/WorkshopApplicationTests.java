package com.workshop;

import com.workshop.dao.WordDao;
import com.workshop.entities.Word;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
class WorkshopApplicationTests {
    @Autowired
    private WordDao wordDao;

    @Test
    public void daoTest() {
        Optional<Word> word = wordDao.findById(1);
        System.out.println(word);
    }

}
