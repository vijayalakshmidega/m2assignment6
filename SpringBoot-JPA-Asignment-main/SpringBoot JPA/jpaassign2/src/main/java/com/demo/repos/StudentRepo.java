package com.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Product;
import com.demo.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
