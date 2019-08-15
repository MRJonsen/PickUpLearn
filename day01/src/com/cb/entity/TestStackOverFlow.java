package com.cb.entity;


/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/8/12
 * @Version 1.0
 */
public class TestStackOverFlow {
    public static void main(String[] args) {
        try {
            int i = 1;
            int j = 1;
            String a = "s";
            String s = new String("s");
            System.out.println(a.hashCode()+"---"+s.hashCode());
            System.out.println(a==s);
//            sub(0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void  sub(int i) {
        System.out.println(i++);
        sub(i);
    }
}
