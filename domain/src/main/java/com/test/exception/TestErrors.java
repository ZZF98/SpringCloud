package com.test.exception;

import com.core.ErrorObject;

/**
 * @ClassName: Errors
 * @Auther: zzf
 * @Date: 2019/3/12 22:04
 * @Description:
 */
public class TestErrors {
    public static class TestError{
        public final static ErrorObject testException = new ErrorObject("E100", "testException", "被除数不得大于除数");
    }
}
