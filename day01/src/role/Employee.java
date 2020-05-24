package role;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/6/19
 * @Version 1.0
 */
public class Employee extends Role {
    private static int ID = 0;
    private String salary;
    private int id;

    public Employee(String name, int age, String sex, String salary) {
//        super(name, age, sex);
        this.salary = salary;
        setName(name);
        setAge(age);
        setSex(sex);
        this.id = ID++;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Employee.ID = ID;
    }

    public String getSalary() {

        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "salary='" + salary + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    void play() {
        System.out.println(this.toString());
//        StringBuffer result = new StringBuffer();
//        try {
//            // 获得当前类的Class
//            Class<? extends Role> clazz = this.getClass();
//
//            // 获取当前类的全部属性
//            Field[] fields = clazz.getDeclaredFields();
//            for (Field field : fields) {
//
//                // 遍历属性得到属性名
//                String fieldName = field.getName();
//
//                // 如果是用于序列化的直接过滤掉
//                if ("serialVersionUID".equals(fieldName)) {
//                    continue;
//                }
//
//                // 判断属性的类型，主要是区分boolean和其他类型
//                Class<?> type = field.getType();
//
//                // boolean的取值是is,其他是get
//                String methodName = (type.getTypeName().equals("boolean")?"is":"get")
//                        + fieldName.substring(0,1).toUpperCase()
//                        + fieldName.substring(1, fieldName.length());
//
//                Method method;
//                java.java.lang.Object resultObj;
//
//                // 通过方法名得到方法对象
//                method = clazz.getMethod(methodName);
//
//                // 得到这个方法的返回值
//                resultObj = method.invoke(this);
//
//                // 将属性名和它对应的值进行匹配打印
//                if (resultObj != null && !"".equals(resultObj)) {
//                    result.append("[").
//                            append(fieldName).append("]").append(resultObj).append(" ");
//                }
//            }
//        } catch (SecurityException | NoSuchMethodException | IllegalAccessException
//                | IllegalArgumentException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        System.out.println(result.toString());

    }
}
