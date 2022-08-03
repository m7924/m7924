package com.suyao.arch_web.controller;

import com.suyao.arch_common.vo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {

    /**
     * 需要注入redis模板
     *
     * 对于RedisTemplate的泛型情况,
     * 可以使用<String, String>
     *       <Object, Object>
     *       或者不写泛型
     *
     *  注意,属性的名称必须为redisTemplate,因为按名称注入,框架创建的对象就是这个名字的
     */
    //RedisTemplate : 把key和value经过了序列化,key和value都是序列化的内容,不能直接识别,默认使用的是JDK的序列化,可以修改为其他的序列化
    @Resource
    private RedisTemplate redisTemplate;

    //StringRedisTemplate : 这个类将key和value都做String处理,使用的是String的序列化,可读性好
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    // 添加数据到redis
    //@PostMapping("/redis/addstring")
    @GetMapping("/redis/addstring")
    public String addToRedis(String name, String value) {

        // 操作Redis中的string类型的数据,先获取ValueOperation
        ValueOperations valueOperations = redisTemplate.opsForValue();

        // 添加数据到redis
        valueOperations.set(name, value);
        return "向redis添加string类型的数据";
    }

    // 从redis获取数据
    @GetMapping("/redis/getk")
    public String getData(String key) {

        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object v = valueOperations.get(key);
        return "key是" + key + ",它的值是:" + v;
    }

    @PostMapping("/redis/{k}/{v}")
    public String addStringKV(@PathVariable String k,
                              @PathVariable String v) {

        // 使用StringRedisTemplate对象
        stringRedisTemplate.opsForValue().set(k,v);
        return "使用StringRedisTemplate对象添加";
    }

    @GetMapping("/redis/{k}")
    public String getStringValue(@PathVariable String k) {

        // 获取String类型的value
        String v = stringRedisTemplate.opsForValue().get(k);
        return "从redis中通过" + k + "获取到string类型的v=" + v;
    }

    /** 设置RedisTemplate序列化机制
     *  可以设置 key 的序列化,也可以设置 value 的序列化
     *  也可以同时设置
     */
    @PostMapping("/redis/addstr")
    public String addString(String k, String v) {

        // 设置RedisTemplate的序列化机制
        // 设置key为string类型的序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 设置value的序列化
        redisTemplate.setValueSerializer(new StringRedisSerializer());

        redisTemplate.opsForValue().set(k, v);
        return "添加了k和v";
    }

    /**
     * 使用json序列化
     */
    @PostMapping("/redis/addjson")
    public String addJson() {

        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(20);
        student.setId(1);

        // 设置key为string的序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 设置value为json的序列化方式,json为Student类型的方式组织,所以需要传入Student.class
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        redisTemplate.opsForValue().set("myStudent", student);
        return "存入json类型的数据student";
    }

}
