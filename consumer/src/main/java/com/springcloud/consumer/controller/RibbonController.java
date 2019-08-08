package com.springcloud.consumer.controller;

import com.core.Result;
import com.test.domain.Test;
import com.test.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName: RibbonController
 * @Auther: zzf
 * @Date: 2019/3/5 21:06
 * @Description:
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String provider="http://provider-1";
    /**
     * 查询
     * @return
     */
    @GetMapping("/test")
    public Result listTest(){
        return restTemplate.getForObject(provider+"/test",Result.class);
    }

    /**
     * 查询
     * @return
     */
    @DeleteMapping("/test/{id}")
    public void deleteTest(@PathVariable("id") String id){
        restTemplate.delete(provider+"/test/{id}",id);
    }

    /**
     * 查询
     * @return
     */
    @PostMapping("/test")
    public Result insertTest(@RequestBody TestDto test){
       return restTemplate.postForEntity(provider+"/test",test,Result.class).getBody();
    }


}
