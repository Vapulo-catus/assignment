package th.ac.tu.cs.assignment1.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.ac.tu.cs.assignment1.model.Student;
import th.ac.tu.cs.assignment1.repository.StudentRepository;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents() {
        try {
            List<Student> students = studentRepository.findAll();

            // Check if any students were found
            if (students.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT); // No students found
            }

            return new ResponseEntity<>(students, HttpStatus.OK);
        } catch (Exception e) {
            // Handle any exceptions and return an error response
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/student")
    public ResponseEntity<String> createTutorial(@RequestBody Student student) {
        try {
            studentRepository.save(student);
            return new ResponseEntity<>("Student was created successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
