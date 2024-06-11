package com.mvc.rest.Controller;

import com.mvc.rest.Entity.Student;
import com.mvc.rest.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/")
    public ModelAndView  getHome() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("Home");
        return mv;
    }
    @RequestMapping("register")
    public ModelAndView registerStudent(@ModelAttribute Student st){
        ModelAndView mv = new ModelAndView();
        studentService.registerStudent(st);
        mv.addObject("message", "saved");
        mv.setViewName("Home");
        return mv;
    }
    @RequestMapping("searchByAddress")
    public ModelAndView getStudentAddress(@RequestParam("address") String address) {
        ModelAndView mv=new ModelAndView();
        List<Student> st=studentService.getStudentsByAddress(address);
        mv.addObject("students",st)	;
        mv.setViewName("Result") ;
        return mv;
    }

    @RequestMapping("deleteById")
    public ModelAndView deleteStudent(@RequestParam("id") int id) {
        ModelAndView mv = new ModelAndView();
        studentService.deleteStudent(id);
        mv.addObject("message1", "student deleted");
        mv.setViewName("Home");
        return mv;
    }
    @RequestMapping("searchById")
    public ModelAndView searchStudent(@RequestParam("id") int id) {
        ModelAndView mv = new ModelAndView();
        Student st1 = studentService.getStudentById(id);
        mv.addObject("student", st1);
        mv.setViewName("Result");
        return mv;
    }
    @RequestMapping(value = "updateStudent", method = RequestMethod.GET)
    public ModelAndView showUpdateForm(@RequestParam("id") int id) {
        ModelAndView mv = new ModelAndView();
        Student student = studentService.getStudentById(id);
        mv.addObject("student", student);
        mv.setViewName("UpdateStudent");
        return mv;
    }

    @RequestMapping(value = "updateStudent", method = RequestMethod.POST)
    public ModelAndView updateStudent(Student student) {
        studentService.updateStudent(student);
        return new ModelAndView("redirect:/searchById?id=" + student.getId());
    }
}