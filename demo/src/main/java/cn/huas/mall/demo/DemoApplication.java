package cn.huas.mall.demo;

import cn.huas.mall.demo.entity.User;
import cn.huas.mall.demo.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@SpringBootApplication
@MapperScan("cn.huas.mall.demo.mapper")
public class DemoApplication {


    @Autowired
    UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @GetMapping("/demo")
    public  List<User>  demo() {

        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);
       return userList;
    }
}
