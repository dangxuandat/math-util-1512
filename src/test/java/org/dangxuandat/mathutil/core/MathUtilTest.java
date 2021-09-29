package org.dangxuandat.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


public class MathUtilTest {

    @Test
    public void checkFactorialGivenRightArgumentReturnsWell(){
       long expected = 120;
       long actual = MathUtil.getFactorial(5);

       Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
}