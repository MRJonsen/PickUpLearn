package role;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/6/19
 * @Version 1.0
 */
public class Manager extends Employee {
    private final String vehicle = "BWM";

    public Manager(String name, int age, String sex, String salary) {
        super(name, age, sex, salary);
    }

    public String getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return super.toString()+ "{" +
                "vehicle='" + vehicle + '\'' +
                '}';
    }

}
