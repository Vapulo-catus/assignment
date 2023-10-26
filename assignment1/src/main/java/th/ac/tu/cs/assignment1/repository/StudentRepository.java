package th.ac.tu.cs.assignment1.repository;

import th.ac.tu.cs.assignment1.model.Student;
import java.util.List;

public interface StudentRepository {
    int save(Student book);
    int update(Student book);
    Student findById(Long id);
    int deleteById(Long id);
    List<Student> findAll();
}
