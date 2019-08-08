package com.core;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: Result
 * @Auther: zzf
 * @Date: 2019/3/12 21:54
 * @Description:
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 编码
     */
    private String code ;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private T  data ;

    /**
     * 异常信息
     */
    private Map<String,String> errs ;

    public Result(){}

    public Result(boolean success, String code, String message) {
        this.success=success;
        this.message=message;
        this.code=code;
    }

    public Result(boolean success, String code, String message, T data) {
        this.success=success;
        this.message=message;
        this.code=code;
        this.data=data;
    }
}
