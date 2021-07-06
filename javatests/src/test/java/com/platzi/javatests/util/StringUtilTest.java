package com.platzi.javatests.util;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("Hi", 3);
        if(!result.equals("HiHiHi")) {
            System.out.println("ERROR");
        }

        String result2 = StringUtil.repeat("Hi", 1);
        if(!result2.equals("Hi")) {
            System.out.println("ERROR");
        }
    }
}