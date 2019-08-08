package com.springcloud.provider.dao;

import com.springcloud.provider.dao.provider.TestProvider;
import com.test.dto.TestDto;
import com.test.vo.TestVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TestDao {

    @InsertProvider(type =TestProvider.class , method ="insertTest" )
    void insertTest(TestDto test);

    @Select("select * from test")
    List<TestVo> listTest();

    @Delete("DELETE FROM test WHERE id=#{id}")
    void deleteTest(String id);

    @UpdateProvider(type =TestProvider.class , method ="updateTest" )
    void updateTest(TestDto test);
}
