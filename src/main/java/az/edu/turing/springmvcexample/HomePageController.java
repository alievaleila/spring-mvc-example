package az.edu.turing.springmvcexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomePageController {
    @GetMapping
    public ResponseEntity<Student> homePage() {
//        return new Student(123,"Elvin");
//        return ResponseEntity.notFound().build();
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Student(123, "Elvin"));
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(new Student(123, "Elvin"));
    }

    public record Student(int id, String name) {
    }
}
