package com.kuang.service;

import com.kuang.entity.User;
import com.kuang.mapper.Usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {
    @Autowired(required=false)
    private Usermapper Usermapper;

    public List<User> getAll(){

        return Usermapper.getAll();
    };

    public List<User> add(User user){
        if (Usermapper.findById(user.getId()) != null){
            throw new CustomExcepiton(403,"已存在姓名为"+user.getUsername()+" id为"+user.getId());
        }
        Usermapper.add(user);
        return Usermapper.getAll();
    }

    public List<User> delete(User user){
        if (Usermapper.findById(user.getId()) == null){
            throw new CustomExcepiton(403,"这个id不存在 id为"+user.getId());
        }
        Usermapper.delete(user.getId());
        return Usermapper.getAll();
    }

}
