package com.kuang.controller;

import com.kuang.entity.Result;
import com.kuang.entity.User;
import com.kuang.service.Userservice;
import com.kuang.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/homework", method = RequestMethod.POST)
public class Usercontroller {
    @Autowired
    private Userservice Userservice;

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public Result<User> getAll() throws Exception{
        return ResultUtil.success(Userservice.getAll()) ;
    }


    @RequestMapping(value = "/add")
    @ResponseBody
    public Result<User> insertUser(@RequestBody  User user) throws Exception{
        return ResultUtil.success(Userservice.add(user),"加入名字"+user.getUsername()+" id为"+user.getId());
    }
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Result<User> deleteUser(@RequestBody  User user) throws Exception{
        return ResultUtil.success(Userservice.delete(user),"删除名字"+user.getUsername()+" id为"+user.getId());
    }
    /*
    @RequestMapping(value = "/update")
    public void updateUser(@RequestBody User User){
        UserService.updateByPrimaryKey(User);
    }
    @ResponseBody
    @RequestMapping(value = "/select/{id}")
    public User selectUser(@PathVariable("id") String id ){

        return UserService.selectByPrimaryKey(id);
    }*/
}
