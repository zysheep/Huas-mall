package cn.huas.mall.demo;

import cn.huas.mall.demo.entity.User;
import cn.huas.mall.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);
    }

}
