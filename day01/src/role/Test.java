package role;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/6/19
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("旺仔", 18, "女", "2000");
        employee.play();
        System.out.println("");
        Manager manager = new Manager("boss爿", -1, "男", "2000");
        manager.play();

    }
}
