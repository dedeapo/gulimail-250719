package com.atguigu.modules.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1 整合mybatis-plus
 * 1.导入依赖
 * <dependency>
 *     <groupId>com.baomidou</groupId>
 *     <artifactId>mybatis-plus-boot-starter</artifactId>
 *     <version>3.2.0</version>
 *  </dependency>
 * 2.配置
 * 2.1.配置数据源
 *      导入数据库驱动
 *      在application.yml中配置数据源信息
 *
 * 2.2.配置mybatis-plus
 *      mapperScan接口配置
 *      sql映射文件位置
 *
 *
 *
 */

@MapperScan("com.atguigu.modules.product.dao")
@SpringBootApplication
public class GulimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}
