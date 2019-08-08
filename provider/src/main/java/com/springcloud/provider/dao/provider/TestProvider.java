package com.springcloud.provider.dao.provider;

import com.test.dto.TestDto;
import org.apache.ibatis.jdbc.SQL;

/**
 * @ClassName: TestProvider
 * @Auther: zzf
 * @Date: 2019/3/5 20:09
 * @Description:
 */
public class TestProvider {

    final static String table="test";

    public String insertTest(TestDto test){
        SQL sql=new SQL();
        sql.INSERT_INTO(table);
        sql.VALUES("name","'"+test.getName()+"'");
        sql.VALUES("age","'"+test.getAge()+"'");
        sql.VALUES("address","'"+test.getAddress()+"'");
        sql.VALUES("date","'"+test.getDate()+"'");
        return sql.toString();
    }

    public String updateTest(TestDto test){
        SQL sql=new SQL();
        sql.UPDATE(table);
        sql.SET("name='"+test.getName()+"'");
        sql.SET("age='"+test.getAge()+"'");
        sql.SET("address='"+test.getAddress()+"'");
        sql.SET("date='"+test.getDate()+"'");
        sql.WHERE("id='"+test.getId()+"'");
        return sql.toString();
    }
}
