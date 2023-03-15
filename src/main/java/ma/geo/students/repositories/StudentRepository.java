package ma.geo.students.repositories;

import ma.geo.students.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {



    StudentEntity create(StudentEntity entity);
    StudentEntity update(StudentEntity entity);
    boolean delete (long id);
    List<StudentEntity> readAll (StudentEntity entity);
}
