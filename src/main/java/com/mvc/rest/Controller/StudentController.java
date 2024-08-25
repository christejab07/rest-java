 package com.mvc.rest.Controller;

 import com.mvc.rest.Entity.Student;
 import com.mvc.rest.Service.StudentService;
 import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.*;
 import org.springframework.web.bind.annotation.*;
// import org.springframework.web.servlet.*;
 import org.springframework.http.ResponseEntity;

 import java.util.List;

// @Controller
// public class StudentController {
//     @Autowired
//     StudentService studentService;
//
//     @RequestMapping("/")
//     public ModelAndView  getHome() {
//         ModelAndView mv=new ModelAndView();
//         studentService.getHomepage();
//         mv.setViewName("Home");
//         return mv;
//     }
//     @RequestMapping("register")
//     public ModelAndView registerStudent(@ModelAttribute Student st){
//         ModelAndView mv = new ModelAndView();
//         studentService.registerStudent(st);
//         mv.addObject("message", "saved");
//         mv.setViewName("Home");
//         return mv;
//     }
//     @RequestMapping("searchByAddress")
//     public ModelAndView getStudentAddress(@RequestParam("address") String address) {
//         ModelAndView mv=new ModelAndView();
//         List<Student> st=studentService.getStudentsByAddress(address);
//         mv.addObject("students",st);
//         mv.setViewName("Results") ;
//         return mv;
//     }
//
//     @RequestMapping("deleteById")
//     public ModelAndView deleteStudent(@RequestParam("id") int id) {
//         ModelAndView mv = new ModelAndView();
//         studentService.deleteStudentById(id);
//         mv.addObject("message1", "student deleted");
//         mv.setViewName("Home");
//         return mv;
//     }
//     @RequestMapping("searchById")
//     public ModelAndView searchStudent(@RequestParam("id") int id) {
//         ModelAndView mv = new ModelAndView();
//         Student st1 = studentService.getStudentById(id);
//         mv.addObject("student", st1);
//         mv.setViewName("Result");
//         return mv;
//     }
//     @RequestMapping(value = "updateStudent", method = RequestMethod.GET)
//     public ModelAndView showUpdateForm(@RequestParam("id") int id) {
//         ModelAndView mv = new ModelAndView();
//         Student student = studentService.getStudentById(id);
//         mv.addObject("student", student);
//         mv.setViewName("UpdateStudent");
//         return mv;
//     }
//
//     @RequestMapping(value = "updateStudent", method = RequestMethod.POST)
//     public ModelAndView updateStudent(Student student) {
//         studentService.updateStudent(student.getId(), student);
//         return new ModelAndView("redirect:/searchById?id=" + student.getId());
//     }
// }
//spring.security.user.password=Test12345_

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/home")
    public ResponseEntity<List<Student>> getHomepage() {
        List<Student> students = studentService.getHomepage();
        return ResponseEntity.ok(students);
    }

    @PostMapping("/register")
    public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
        Student savedStudent = studentService.registerStudent(student);
        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping("/address/{address}")
    public ResponseEntity<List<Student>> getStudentByAddress(@PathVariable String address) {
        List<Student> students = studentService.getStudentsByAddress(address);
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student studentDetails) {
        Student updatedStudent = studentService.updateStudent(id, studentDetails);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable int id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.ok("Student deleted successfully");
    }
}
