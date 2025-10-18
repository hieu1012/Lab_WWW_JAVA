package iuh.fit.se.model;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee {
    private int id;
    private String name = "Le Van C";
    @Autowired
    private Address address;
}
