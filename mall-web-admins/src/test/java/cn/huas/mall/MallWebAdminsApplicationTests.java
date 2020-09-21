package cn.huas.mall;

import cn.huas.mall.entity.User;
import cn.huas.mall.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallWebAdminsApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);
    }

}
