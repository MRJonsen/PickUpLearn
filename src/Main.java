import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        Employer employer = new Employer();
        employer.setName("an");
        changeName(employer);
        System.out.println(employer.getName());
        Employer employer1 = new Employer();
        ObjectOutputStream oos = null;//创建对象输出流
        try {
            oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
            oos.writeObject(employer);
            oos.writeObject(employer1);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void changeName(Employer employer){
        employer.setName("ben");
    }


}
