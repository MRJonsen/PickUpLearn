package test;

import entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: JavaDemo
 * @description: xml方式创建bean
 * @author: jonsen
 * @create: 2020-05-19 19:10
 **/
public class XmlSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("myBean.xml");
        Person bean = classPathXmlApplicationContext.getBean(Person.class);
        System.out.println(bean.getName());
    }
}
