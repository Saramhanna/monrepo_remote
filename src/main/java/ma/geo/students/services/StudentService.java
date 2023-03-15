package ma.geo.students.services;

import ma.geo.students.dto.StudentDto;

import java.util.List;

public interface StudentService {


    StudentDto create (StudentDto dto);
    StudentDto update (StudentDto dto);
    boolean delete (long id);
    List<StudentDto> readAll(StudentDto dto);
}
