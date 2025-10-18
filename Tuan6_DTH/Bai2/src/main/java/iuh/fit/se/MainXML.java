package iuh.fit.se;

import iuh.fit.se.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Employee emp1 = (Employee) context.getBean("employee1");
        //Employee emp2 = (Employee) context.getBean("employee2");

        System.out.println(emp1);
        //System.out.println(emp2);
    }
}
