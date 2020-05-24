package anno;

import entity.Monkey;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @program: JavaDemo
 * @description: 猴子制造厂
 * @author: jonsen
 * @create: 2020-04-01 21:11
 **/
//@Component
public class MonkeyFactory implements FactoryBean<Monkey> {

    @Override
    public Monkey getObject() throws Exception {
        System.out.println("猴子");
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
