package com.springcloud.consumer.factory;

import com.core.Result;
import com.springcloud.consumer.service.FeignService;
import com.test.dto.TestDto;
import com.test.vo.TestVo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: FeignServiceFallbackFactory
 * @Auther: zzf
 * @Date: 2019/3/7 19:43
 * @Description:
 */
@Component
public class FeignServiceFallbackFactory implements FeignService {


    @Override
    public Result insertTest(TestDto test) {
        return new Result(false,"002","失败");
    }

    @Override
    public Result deleteTest(String id) {
        return new Result(false,"002","失败");
    }

    @Override
    public Result listTest() {
        return new Result(false,"002","失败");
    }

    @Override
    public Result error(Integer a, Integer b) {
        return new Result(false,"002","失败","异常：a="+a+",b="+b+"");
    }

    @Override
    public Result updateTest(TestDto test) {
        return new Result(false,"002","失败");
    }
}
