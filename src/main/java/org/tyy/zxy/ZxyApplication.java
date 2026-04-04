package org.tyy.zxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.tyy.zxy.Mapper")
public class ZxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxyApplication.class, args);
    }

}
