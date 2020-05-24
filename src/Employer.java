import java.text.NumberFormat;

/**
 * Created by chenbin on 2018/6/11.
 */
class Employer {
    static {
        System.out.println("静态");
    }
    {
        System.out.println("代码块");
    }
    private static int NEXT_ID = 1000;
    private int id ;
    private String name;

    public static int getNextId() {
        return NEXT_ID;
    }

    public static void setNextId(int nextId) {
        NEXT_ID = nextId;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        id =
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
