package anno;

import entity.Monkey;
import entity.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/11/8
 * @Version 1.0
 */
@Configuration
//@ComponentScan(value = "entity" )
@Import({Monkey.class})
@EnableAspectJAutoProxy(proxyTargetClass = false)//proxyTargetClass默认值为false 底层AOPprox会根据代理类条件（接口）判断使用cglib 还是 jdk动态代理
public class Config {
    @Bean
    public Person getPerson(){
        System.out.println("初始化");
        return new Person();
    }
}
