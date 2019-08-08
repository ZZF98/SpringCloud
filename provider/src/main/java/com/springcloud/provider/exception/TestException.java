package com.springcloud.provider.exception;

import com.core.ErrorObject;
import lombok.Data;

/**
 * @ClassName: TestException
 * @Auther: zzf
 * @Date: 2019/3/12 22:10
 * @Description:
 */
@Data
public class TestException extends RuntimeException{

    private ErrorObject error ;

    public TestException(String msg) {
        super(msg) ;
    }

    public TestException(ErrorObject error) {
        this.error = error ;
    }
}
