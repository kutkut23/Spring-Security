package com.security.SpringSecurity.controller;

import com.security.SpringSecurity.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Kutkut", 60),
            new Student(2, "Subho", 65),
            new Student(3, "Deep", 50),
            new Student(4, "Bitto", 80)
    ));

    @GetMapping("/students")
    public List<Student> students() {
        return students;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    // When Spring Security is enabled, we can't add, update, delete records without passing CSRF Token.
    // Generating CSRF token
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
