package com.test.domain;

import lombok.Data;

/**
 * 测试类
 * @ClassName: Test
 * @Auther: zzf
 * @Date: 2019/3/3 14:24
 * @Description:
 */
@Data
public class Test {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 地址
     */
    private String address;

    /**
     * 日期
     */
    private String date;

}
