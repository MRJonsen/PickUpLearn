package test;

import entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: JavaDemo
 * @description: 测试xml配置
 * @author: jonsen
 * @create: 2020-03-31 22:21
 **/
public class XmlCxtTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) classPathXmlApplicationContext.getBean("person");
        System.out.println(person);
    }
}
