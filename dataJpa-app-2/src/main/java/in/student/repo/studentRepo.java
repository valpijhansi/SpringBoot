package in.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.student.entity.Student;

public interface studentRepo extends JpaRepository<Student,Integer> {

}
