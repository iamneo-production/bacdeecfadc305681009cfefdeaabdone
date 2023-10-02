public class Student {
    private int studentId;
    private String firstName;
    private String lastName;

    // Constructors, getters, and setters
}
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Student student() {
        Student student = new Student();
        student.setStudentId(1); // Set an initial student ID
        student.setFirstName("John");
        student.setLastName("Doe");
        return student;
    }
}
    

