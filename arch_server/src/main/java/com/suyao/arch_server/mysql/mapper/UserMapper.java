package com.suyao.arch_server.mysql.mapper;

import com.suyao.arch_common.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2022/7/28 17:53
 * @Created by B105
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User getUserById(Long id);

    @Insert("insert into user(id, name, createdate)values(#{id}, #{name}, #{createdate})")
    int insert(User user);

    @Update("update user set name=#{name} where id=#{id}")
    int update(User user);

    @Delete("delete from user where id=#{id}")
    int delete(String id);

    @Select("select * from user")
    List<User> getAllUsers();
}
