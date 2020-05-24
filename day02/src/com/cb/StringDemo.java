package com.cb;

import com.cb.Class.Zi;

import java.util.Objects;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/6/2
 * @Version 1.0
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode()+","+s2.hashCode());
        Zi zi = new Zi();
        Zi zi1 = new Zi();
    }
}
