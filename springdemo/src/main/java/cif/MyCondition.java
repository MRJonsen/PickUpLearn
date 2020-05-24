package cif;

import com.sun.deploy.util.ArrayUtil;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: JavaDemo
 * @description:
 * @author: jonsen
 * @create: 2020-05-22 15:06
 **/
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        String property = conditionContext.getEnvironment().getProperty("os.name");
        System.out.println(property);
        return true;
    }
}
