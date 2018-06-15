package com.qfedu.mybatis.mapper;

import com.qfedu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectUserIf(@Param("username") String username,@Param("sex") String sex);
    //MyBatis官方api强调，不要多态Mapper的方法。可能会导致框架内部反射的时候发生错误！
    //List<User> selectUserIf();
    List<User> selectUserChoose(Map<String ,Object> map);


    List<User> selectUserWhere(@Param("username") String username,@Param("sex") String sex);

    int updateUserSetIf(User user);


    int updateUserTrimIf(User user);


    List<User> selectUserTrimIf(@Param("username") String username,@Param("sex") String sex);

    List<User> selectForeachList(List<Integer> ids);
    List<User> selectForeachArray(Integer[] ids);
    List<User> selectForeachMap(Map<String,Object> map);
}
