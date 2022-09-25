package cn.wenhe9.yeb.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DuJinliang
 * 2022/09/09
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.wenhe9.yeb.server.mapper")
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class, args);
    }
}
