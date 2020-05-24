package test;

import anno.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/11/8
 * @Version 1.0
 */
public class AnTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
//        UserDao bean = annotationConfigApplicationContext.getBean(UserDao.class);
//        Object monkeyFactory = annotationConfigApplicationContext.getBean("monkeyFactory");
//        System.out.println(monkeyFactory);

//        System.out.println(bean.getUser());
//        annotationConfigApplicationContext.getBean(Monkey.class);
        Object getPerson = annotationConfigApplicationContext.getBean("getPerson");
        annotationConfigApplicationContext.close();
    }

}
