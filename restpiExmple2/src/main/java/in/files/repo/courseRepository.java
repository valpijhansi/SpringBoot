package in.files.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.files.binding.course;

public interface courseRepository extends JpaRepository<course,Serializable> {

}