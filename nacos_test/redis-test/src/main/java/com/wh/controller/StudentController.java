package com.wh.controller;

import com.wh.Util.RedisUtil;
import com.wh.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.Date;

/**
 * 什么？我是真滴帅
 *
 * @author LiXuekai on 2021/9/27
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

//    @Autowired
//    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

//    @RequestMapping("/set")
//    public String set(@RequestBody Student student){
//        redisTemplate.opsForValue().set("student",student);
//        return "ok";
//    }
//
//    @GetMapping("/{key}")
//    public Student get(@PathVariable String key){
//        return (Student) redisTemplate.opsForValue().get(key);
//    }
//
//    @DeleteMapping("/{key}")
//    public boolean delete(@PathVariable String key){
//        Boolean res = redisTemplate.delete(key);
//        return res;
//    }
    @RequestMapping("set")
    public boolean redisSet(String key,String value){
        Student student =new Student();
        student.setId(Long.valueOf(1));
        student.setGuid(String.valueOf(1));
        student.setName("zhangsan");
        student.setAge(String.valueOf(20));
        student.setCreateTime(new Date());
        return redisUtil.set(key,value);
    }
}
