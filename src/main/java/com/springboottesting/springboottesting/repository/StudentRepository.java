package com.springboottesting.springboottesting.repository;

import com.springboottesting.springboottesting.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {

}
