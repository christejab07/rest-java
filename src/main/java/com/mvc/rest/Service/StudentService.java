package com.mvc.rest.Service;

import com.mvc.rest.Entity.Student;
import com.mvc.rest.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    public void registerStudent(Student student) {
        studentRepo.save(student);
    }
    public List<Student> getStudentsByAddress(String address) {
        return studentRepo.findByAddress(address);
    }
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }
    public void updateStudent(Student student) {
        studentRepo.save(student);
    }
}