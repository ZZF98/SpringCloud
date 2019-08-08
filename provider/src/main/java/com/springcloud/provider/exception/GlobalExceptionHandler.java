package com.springcloud.provider.exception;

import com.core.ErrorObject;
import com.core.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: GlobalExceptionHandler
 * @Auther: zzf
 * @Date: 2019/3/12 22:08
 * @Description:
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TestException.class)
    @ResponseBody
    public Result TestException(TestException e){
        ErrorObject error = e.getError() ;
        Result result = new Result(false,"002",error.getMessage());
        return result;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result Exception(TestException e){
        ErrorObject error = e.getError() ;
        Result result = new Result(false,"002",error.getMessage());
        return result;
    }
}
