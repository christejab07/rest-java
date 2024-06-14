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
    public List<Student> getHomepage() {
        return studentRepo.findAll();
    }
    public Student registerStudent(Student student) {
        studentRepo.save(student);
        return student;
    }
    public List<Student> getStudentsByAddress(String address) {
        return studentRepo.findStudentsByAddress(address);
    }

    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);
    }
    public Student updateStudent(int id, Student studentDetails) {
        Student student = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        student.setFirstname(studentDetails.getFirstname());
        student.setLastname(studentDetails.getLastname());
        student.setAddress(studentDetails.getAddress());
        return studentRepo.save(student);
    }
}