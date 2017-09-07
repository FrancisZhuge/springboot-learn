package com.francis.chapter81.dao;

import com.francis.chapter81.domian.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonDao extends JpaRepository<Person,Long>{
    List<Person> findByAddress(String address);

    Person findByNameAndAddress(String name,String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name") String name, @Param("address") String address);

    Person withNameAndAddressNamedQuery(String name,String address);
}
