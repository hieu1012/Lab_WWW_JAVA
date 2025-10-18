package iuh.fit.se;

import iuh.fit.se.model.Address;
import iuh.fit.se.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address() {
        return new Address("Cần Thơ", "Hòa Bình", "Việt Nam");
    }

    @Bean
    public Employee employee() {
        return new Employee(22,"Phạm Thị D", address());
    }
}
