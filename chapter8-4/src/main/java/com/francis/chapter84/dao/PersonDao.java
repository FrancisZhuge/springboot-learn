package com.francis.chapter84.dao;

import com.francis.chapter84.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Long>{
}
