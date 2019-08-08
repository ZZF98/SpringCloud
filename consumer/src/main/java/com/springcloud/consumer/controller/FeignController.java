package com.springcloud.consumer.controller;

import com.core.Result;
import com.springcloud.consumer.service.FeignService;
import com.test.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Feign使用
 *
 * @ClassName: FeignController
 * @Auther: zzf
 * @Date: 2019/3/6 19:46
 * @Description:
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignService feignService;

    /**
     * 查询
     *
     * @return
     */
    @GetMapping("/test")
    public Result listTest() {
        return feignService.listTest();
    }

    /**
     * 测试
     *
     * @param id
     * @return
     */
    @DeleteMapping("/test/{id}")
    public Result deleteTest(@PathVariable("id") String id) {
        return feignService.deleteTest(id);
    }

    /**
     * 新增
     *
     * @return
     */
    @PostMapping("/test")
    public Result insertTest(@RequestBody TestDto test) {
        return feignService.insertTest(test);
    }

    /**
     * 异常测试
     *
     * @param a
     * @param b
     * @return
     */
    @GetMapping("/error/{a}/{b}")
    public Result error(@PathVariable("a") Integer a,@PathVariable("b") Integer b) {
        return feignService.error(a,b);
    }

    /**
     * 更新
     * @param test
     */
    @PutMapping("/test")
    public Result updateTest(@RequestBody TestDto test){
        return feignService.updateTest(test);
    }
}
