package anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoaderListener;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/11/8
 * @Version 1.0
 */
@Aspect
@Component
public class AspectD  {

    @Pointcut("execution(* anno.UserDao.*(..))")
    public void pointCut(){

    }

    @Around("pointCut()")
    public Object ArroundD(ProceedingJoinPoint pj){
        System.out.println("前");
        try {
//           return pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("后");
        return "s";
    }

}
