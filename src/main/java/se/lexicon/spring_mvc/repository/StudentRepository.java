package se.lexicon.spring_mvc.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.spring_mvc.entity.Student;

import java.util.Optional;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public interface StudentRepository extends CrudRepository<Student,Integer> {
    Optional<Student> findByEmail(String email);
}
