package com.cb;

import com.cb.entity.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/5/16
 * @Version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        Student student = new Student("里斯", "18", 135);
        try {
            File file = new File("h.txt");
            if (file.createNewFile()){
                System.out.println("s");
            }
            if (file.delete()){
                System.out.println("删除成功");
            }
            System.out.println(file.getAbsolutePath());
            Student clone = (Student) student.clone();
            System.out.println(clone.toString());
            System.out.println(student.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void testBefore(){
        System.out.println("before");
    }
    @Test
    public void Test(){
        System.out.println("person");

    }
    @After
    public void testAfter(){
        System.out.println("After");
    }
}
