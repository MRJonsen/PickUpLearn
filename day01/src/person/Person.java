package person;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/6/19
 * @Version 1.0
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            int ageHighLimit = 130;
            int ageLowLimit = 0;
            if (age < ageLowLimit || age > ageHighLimit) {
                throw new Exception("合法年龄为"+ ageLowLimit +"-"+ ageHighLimit +"！！！");
            } else {
                this.age = age;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
