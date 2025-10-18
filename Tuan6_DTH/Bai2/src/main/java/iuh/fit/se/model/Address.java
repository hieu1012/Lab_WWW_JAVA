package iuh.fit.se.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Address {
    private String city = "Đà Nẵng";
    private String state = "Nguyễn Oanh";
    private String country = "Việt Nam";

}
