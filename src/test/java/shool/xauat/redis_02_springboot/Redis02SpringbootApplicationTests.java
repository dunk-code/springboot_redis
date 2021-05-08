package shool.xauat.redis_02_springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import shool.xauat.pojo.User;
import shool.xauat.util.RedisUtil;

import java.util.Set;

@SpringBootTest
class Redis02SpringbootApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisUtil redisUtil;

    @Test
    void contextLoads() {
        User user = new User("zhangsan", "123456");
        //传入User对象能成功的原因，添加了User的无参构造
        redisTemplate.opsForValue().set("user", user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

    @Test
    public void Test() {
        Set<String> keys = redisUtil.keys("*");
        redisUtil.delete(keys);
        User user = new User("zhangsan", "123456");
        redisUtil.set("user", user);
        System.out.println(redisUtil.get("user"));
    }

}
