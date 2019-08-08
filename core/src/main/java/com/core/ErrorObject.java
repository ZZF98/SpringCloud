package com.core;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: ErrorObject
 * @Auther: zzf
 * @Date: 2019/3/12 21:57
 * @Description:
 */
@Data
@AllArgsConstructor
public class ErrorObject {
    /**
     * 编码
     */
    private String code ;

    /**
     * 异常名
     */
    private String name ;

    /**
     * 消息
     */
    private String message ;

}
