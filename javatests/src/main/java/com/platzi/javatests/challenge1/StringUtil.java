package com.platzi.javatests.challenge1;

public class StringUtil {

    public static boolean isEmpty(String str)
    {
        //trim remove spaces
        return str == null || !(str.trim().length() > 0);
    }
}
