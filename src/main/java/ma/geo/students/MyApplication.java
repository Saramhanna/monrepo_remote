package ma.geo.students;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
    private final static Logger LOGGER= LoggerFactory.getLogger(MyApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(MyApplication.class);
        LOGGER.trace("star appli log 1");
        LOGGER.debug("star appli log 2");
        LOGGER.info("star appli log 3");
        LOGGER.warn("star appli log 4");
        LOGGER.error("star appli log 5");
    }
}
