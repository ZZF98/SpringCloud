package com.springcloud.provider.service.impl;

import com.alibaba.fastjson.JSON;
import com.springcloud.provider.dao.TestDao;
import com.springcloud.provider.exception.TestException;
import com.springcloud.provider.service.TestService;
import com.test.dto.TestDto;
import com.test.exception.TestErrors;
import com.test.vo.TestVo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: TestServiceImpl
 * @Auther: zzf
 * @Date: 2019/3/5 20:02
 * @Description:
 */
@Service
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = LogManager.getLogger(TestServiceImpl.class);

    @Autowired
    private TestDao testDao;

    @Override
    public void insertTest(TestDto test)
    {
        LOGGER.info("新增:"+JSON.toJSONString(test, true));
        testDao.insertTest(test);
    }

    @Override
    public List<TestVo> listTest() {
        List<TestVo> list=testDao.listTest();
        LOGGER.info("查询结果:"+JSON.toJSONString(list, true));
        return list;
    }

    @Override
    public void deleteTest(String id) {
        LOGGER.info("删除id:"+JSON.toJSONString(id, true));
        testDao.deleteTest(id);
    }

    @Override
//    @HystrixCommand(fallbackMethod = "backMethod")
    public String error(Integer a,Integer b) {
        if(b>a)
            throw new TestException(TestErrors.TestError.testException);
        Integer data=a/b;
        return "a/b="+data;
    }

    @Override
    public void updateTest(TestDto test) {
        LOGGER.info("更新数据:"+JSON.toJSONString(test, true));
        testDao.updateTest(test);
    }

//    public String backMethod(Integer a,Integer b){
//        return new String("出现异常，a为"+a+",b为"+b);
//    }
}
