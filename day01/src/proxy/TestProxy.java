package proxy;

/**
 * @program: JavaDemo
 * @description:
 * @author: jonsen
 * @create: 2020-04-15 08:58
 **/
public class TestProxy {

    public static void main(String[] args) {
        UserService userService = new UserService(){

            @Override
            public int add() {
                return 0;
            }
        };

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService) myInvocationHandler.getProxy();
        proxy.add();

    }
}
