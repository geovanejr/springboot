package endpoint;

import model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndpoint {

    @GetMapping(path = "/list")
    public List<Student> listAll() {

        return asList(new Student("Geovane"), new Student("Lilian"));
    }
}
