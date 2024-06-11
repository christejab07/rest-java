package com.mvc.rest.Repository;

import com.mvc.rest.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByAddress(String address);
    void deleteById(int id);
}