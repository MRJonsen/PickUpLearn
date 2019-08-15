package role;

import sun.reflect.misc.FieldUtil;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/6/19
 * @Version 1.0
 */
public abstract class Role {
    private String name;
    private int age;
    private String sex;

    abstract void play();

    public Role() {
    }

    public Role(String name, int age, String sex) {
        this.name = name;
        setSex(sex);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            int ageHighLimit = 100;
            int ageLowLimit = 0;
            if (age < ageLowLimit || age > ageHighLimit) {
                throw new Exception("合法年龄为" + ageLowLimit + "-" + ageHighLimit + "！！！");
            } else {
                this.age = age;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String man = "男";
        String women = "女";
        try {
            if (!man.equalsIgnoreCase(sex) || !women.equalsIgnoreCase(sex)) {
                this.sex = sex;
            } else {
                throw new Exception("性别只能为" + man + "-" + women + "！！！");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
