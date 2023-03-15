package ma.geo.students.controller;

import ma.geo.students.dto.StudentDto;
import ma.geo.students.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {
    private static final Logger
            LOGGER= LoggerFactory.getLogger(StudentController.class);
    private StudentService service;
    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping("/Save")
    public StudentDto create(StudentDto dto) {
        LOGGER.debug("Star method name {}",dto);

        LOGGER.debug("end method name {}",dto);
        return service.create(dto);

    }
    @PutMapping
    public StudentDto update(StudentDto dto) {
        LOGGER.debug("Star method name {}",dto);
        LOGGER.debug("end method name {}",dto);
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public boolean delete( long id) {
        LOGGER.debug("Star method id {}",id);

        LOGGER.debug("end method id {}",id);
        return service.delete(id);
    }
    @GetMapping

    public List<StudentDto> readAll(StudentDto dto) {
        LOGGER.debug("Star method name {}",dto);

        LOGGER.debug("end method name {}",dto);
        return service.readAll(dto);
    }
}
