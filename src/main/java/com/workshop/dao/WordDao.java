package com.workshop.dao;

import com.workshop.entities.Word;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WordDao extends CrudRepository<Word, Integer> {
    Optional<Word> findById(Integer id);
    long count();
}
