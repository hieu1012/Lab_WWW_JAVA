package iuh.fit.se;

import iuh.fit.se.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "")
public class MainAnno {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MainAnno.class);

        Employee emp = context.getBean(Employee.class);
        System.out.println(emp);
    }
}
