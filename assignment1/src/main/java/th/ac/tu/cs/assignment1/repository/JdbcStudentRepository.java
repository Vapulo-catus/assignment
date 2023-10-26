package th.ac.tu.cs.assignment1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import th.ac.tu.cs.assignment1.model.Student;

import java.util.List;

@Repository
public class JdbcStudentRepository implements StudentRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int save(Student student) {
        String sql = "INSERT INTO student (date, title, firstName, lastName, registrationNumber, yearOfStudy, fieldOfStudy, advisor, addressNumber, moo, subdistrict, district, province, postalCode, mobileNumber, homeNumber, reason) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, student.getDate(), student.getTitle(), student.getFirstName(),
                student.getLastName(), student.getRegistrationNumber(), student.getYearOfStudy(),
                student.getFieldOfStudy(), student.getAdvisor(), student.getAddressNumber(),
                student.getMoo(), student.getSubdistrict(), student.getDistrict(), student.getProvince(),
                student.getPostalCode(), student.getMobileNumber(), student.getHomeNumber(),
                student.getReason());
    }

    @Override
    public int update(Student student) {
        String sql = "UPDATE student " +
                "SET date = ?, title = ?, firstName = ?, lastName = ?, registrationNumber = ?, yearOfStudy = ?, fieldOfStudy = ?, advisor = ?, addressNumber = ?, " +
                "moo = ?, subdistrict = ?, district = ?, province = ?, postalCode = ?, mobileNumber = ?, homeNumber = ?, reason = ? " +
                "WHERE id = ?";
        return jdbcTemplate.update(sql, student.getDate(), student.getTitle(), student.getFirstName(),
                student.getLastName(), student.getRegistrationNumber(), student.getYearOfStudy(),
                student.getFieldOfStudy(), student.getAdvisor(), student.getAddressNumber(),
                student.getMoo(), student.getSubdistrict(), student.getDistrict(), student.getProvince(),
                student.getPostalCode(), student.getMobileNumber(), student.getHomeNumber(),
                student.getReason(), student.getId());
    }


    @Override
    public Student findById(Long id) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM student WHERE id=?",
                    BeanPropertyRowMapper.newInstance(Student.class), id);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("DELETE FROM student WHERE id=?", id);
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * from student", BeanPropertyRowMapper.newInstance(Student.class));
    }

}
