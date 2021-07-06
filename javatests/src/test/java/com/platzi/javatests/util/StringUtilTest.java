package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {

        Assert.assertEquals("HiHiHi", StringUtil.repeat("Hi", 3));

        Assert.assertEquals( "Hi", StringUtil.repeat("Hi", 1));
    }
}