package cif;

import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
public class SpringConfig {

    @Bean
    public Person getPerson(){
        System.out.println("初始化");
        return new Person();
    }

}
