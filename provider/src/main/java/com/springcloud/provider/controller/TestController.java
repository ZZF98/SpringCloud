package com.springcloud.provider.controller;

import com.core.Result;
import com.springcloud.provider.service.TestService;
import com.test.dto.TestDto;
import com.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: Test
 * @Auther: zzf
 * @Date: 2019/3/3 14:25
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 测试
     *
     * @param test
     * @return
     */
    @PostMapping("/test")
    public Result insertTest(@RequestBody TestDto test) {
        testService.insertTest(test);
        return new Result(true,"001","成功");
    }

    /**
     * 测试
     *
     * @param id
     * @return
     */
    @DeleteMapping("/test/{id}")
    public Result deleteTest(@PathVariable("id") String id) {
        testService.deleteTest(id);
        return new Result(true,"001","成功");
    }

    /**
     * 测试
     *
     * @param
     * @return
     */
    @GetMapping("/test")
    public Result listTest() {
        return new Result(true,"001","成功",testService.listTest());
    }

    /**
     * 测试
     * @param test
     */
    @PutMapping("/test")
    public Result updateTest(@RequestBody TestDto test){
        testService.updateTest(test);
        return new Result(true,"001","成功");
    }

    /**
     * 异常测试
     *
     * @param a
     * @param b
     * @return
     */
    @GetMapping("/error/{a}/{b}")
    public Result error(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return new Result(true,"001","成功", testService.error(a, b));
    }
}
