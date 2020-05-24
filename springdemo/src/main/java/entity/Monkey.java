package entity;

import cif.MyCondition;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @program: JavaDemo
 * @description: 猴子
 * @author: jonsen
 * @create: 2020-04-01 21:10
 **/
@Component
@Conditional(MyCondition.class)
public class Monkey implements InitializingBean, DisposableBean {

    public Monkey() {
        System.out.println("Monkey()创建");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

}
