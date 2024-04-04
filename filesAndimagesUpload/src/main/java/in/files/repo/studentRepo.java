package in.files.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.files.entity.Student;

public interface studentRepo extends JpaRepository<Student, Integer> {

}
