package com.platzi.javatests.challenge1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("Not empty"));
    }

    @Test
    public void string_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void string_is_null(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_is_empty_with_space(){
        assertTrue(StringUtil.isEmpty(" "));
    }

}