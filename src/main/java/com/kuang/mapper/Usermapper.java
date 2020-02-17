package com.kuang.mapper;

import com.kuang.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Usermapper {
//    int insert(User user);
//    int deleteByPrimaryKey(Integer id);
//    int updateByPrimaryKey(User user);
//    User selectByPrimaryKey(Integer id);
    List<User> getAll();
    void add(User user);
    User findById(int id);
    void delete(int id);
}
