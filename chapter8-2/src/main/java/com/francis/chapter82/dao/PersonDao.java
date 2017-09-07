package com.francis.chapter82.dao;

import com.francis.chapter82.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Long>{
}
