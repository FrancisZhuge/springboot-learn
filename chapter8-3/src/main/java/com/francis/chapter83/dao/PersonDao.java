package com.francis.chapter83.dao;

import com.francis.chapter83.domain.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonDao {
    @Select("select * from person where name =#{name}")
    Person findByName(@Param("name") String name);

    @Insert("insert into person(name,age,address) values(#{name},#{age},#{address})")
    int insert(@Param("name") String name,@Param("age") Integer age, @Param("address") String address);

}
