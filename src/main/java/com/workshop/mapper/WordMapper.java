package com.workshop.mapper;

import com.workshop.model.Word;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WordMapper {

    @Select("select * from ddd where id = #{id}")
    Word findById(Integer id);

    @Insert("insert into word (description, print) values (#{description}, #{print})")
    void insert(Word word);

    @Select("select count(1) from ddd")
    Integer count();
}
