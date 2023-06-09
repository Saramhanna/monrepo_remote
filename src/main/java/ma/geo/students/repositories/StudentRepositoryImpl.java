package ma.geo.students.repositories;

import ma.geo.students.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private final static Logger
            LOGGER = LoggerFactory.getLogger(StudentRepositoryImpl.class);

    @Override
    public StudentEntity create(StudentEntity entity) {
        LOGGER.debug("Star method name");
        LOGGER.debug("end method name");
        return new StudentEntity();
    }

    @Override
    public StudentEntity update(StudentEntity entity) {
        LOGGER.debug("Star method name {} ");
        LOGGER.debug("end method name {}");
        return new StudentEntity();
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("Star method id {} ", id);
        LOGGER.debug("end method id {}", id);
        return false;

    }

    @Override
    public List<StudentEntity> readAll(StudentEntity entity) {
        LOGGER.debug("Star method name {} ");
        LOGGER.debug("end method name {}");
        return new ArrayList<>();
    }
}