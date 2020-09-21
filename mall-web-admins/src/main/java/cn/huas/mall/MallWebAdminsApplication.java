package cn.huas.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.huas.mall.mapper")
public class MallWebAdminsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallWebAdminsApplication.class, args);
    }

}
