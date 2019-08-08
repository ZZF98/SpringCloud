package com.springcloud.provider.service;

import com.test.dto.TestDto;
import com.test.vo.TestVo;

import java.util.List;

public interface TestService {

    /**
     * 新增
     *
     * @param test
     */
    void insertTest(TestDto test);

    /**
     * 查询
     *
     * @return
     */
    List<TestVo> listTest();

    /**
     * 删除
     *
     * @param id
     */
    void deleteTest(String id);

    /**
     * 异常
     *
     * @param a
     * @param b
     * @return
     */
    String error(Integer a, Integer b);


    /**
     * 修改
     * @param test
     */
    void updateTest(TestDto test);
}
