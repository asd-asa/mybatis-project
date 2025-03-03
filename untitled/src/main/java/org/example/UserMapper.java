package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> selectAll();

    @Delete("DELETE FROM users WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO users (name, age, sal) VALUES (#{name}, #{age}, #{sal})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser(User user);

    @Update("UPDATE users SET sal = #{sal} WHERE id = #{id}")
    int updateSalById(@Param("id") int id, @Param("sal") double sal);
}