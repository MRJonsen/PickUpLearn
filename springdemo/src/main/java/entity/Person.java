package entity;

import lombok.Data;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/9/29
 * @Version 1.0
 */
@Data
public class Person {
    private String name;
    private int age;

    public void init(){
        System.out.println("初始化");
    }

    void destroy(){
        System.out.println("destroy");
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
        this.age = age;
    }
}
