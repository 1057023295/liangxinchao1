package com.qfedu.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory=null;
    static{
        try {
            InputStream in=Resources.getResourceAsStream("mybatisConfig.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
            sqlSessionFactory.getConfiguration().addMappers("com.qfedu.mybatis.mapper");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static SqlSession session(){
        return sqlSessionFactory.openSession();
    }


}
