package camt.cbsd.services;

import camt.cbsd.entity.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("secondDataSource")
@Service
public class StudentServiceImpl2 implements StudentService {
    @Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        Student student = new Student(1,"SE-001","Tanaphum","Wichaita",
                3.00,"images/tanaphum.gif",true,0,
                "The me");
        students.add(student);
        student = new Student(2,"SE-002","Nana","Wic",
                4.00,"images/Nana.gif",true,0,
                "The Wic");
        students.add(student);

        return students;
    }
}
