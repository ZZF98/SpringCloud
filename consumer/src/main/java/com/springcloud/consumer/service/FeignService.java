package com.springcloud.consumer.service;


import com.core.Result;
import com.springcloud.consumer.factory.FeignServiceFallbackFactory;
import com.test.dto.TestDto;
import com.test.vo.TestVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "provider-1",fallback=FeignServiceFallbackFactory.class)
public interface FeignService {

    /**
     * 测试
     * @param test
     * @return
     */
    @PostMapping("/test")
    public Result insertTest(@RequestBody TestDto test);

    /**
     * 测试
     * @param id
     */
    @DeleteMapping("/test/{id}")
    public Result deleteTest(@PathVariable("id") String id);

    /**
     * 测试
     * @param
     * @return
     */
    @GetMapping("/test")
    public Result listTest();

    /**
     * 异常测试
     * @param a
     * @param b
     * @return
     */
    @GetMapping("/error/{a}/{b}")
    public Result error(@PathVariable("a") Integer a, @PathVariable("b") Integer b);


    /**
     * 更新
     * @param test
     */
    @PutMapping("/test")
    public Result updateTest(@RequestBody TestDto test);

}
