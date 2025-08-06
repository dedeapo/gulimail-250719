package com.atguigu.gulimail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 1. 如何使用nacos作为配置中心统一管理配置
 *       1. 引入依赖 nacos-config
 *       <dependency>
 *           <groupId>com.alibaba.cloud</groupId>
 *           <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *       </dependency>
 *       2. 创建一个bootstrap.properties.
 *       spring.application.name=gulimail-coupon
 *       spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *       3. 在nacos中管理配置文件
 *       4. 动态获取配置文件
 *      @RefreshScope
 *      @value
 * 2. 配置
 *      1. 命名空间
 *          默认public保留空间，默认都在这个空间下
 *          ①开发、测试、生产，利用命名空间来做环境隔离
 *          注意：在bootstrap.properties中指定命名空间
 *          每一个微服务之间互相隔离，每一个微服务创建一个自己的命名空间配置
 *      2. 配置集
 *
 *      3.配置集ID：类似文件名 DataIDss
 *
 *      4. 配置分组
 *      spring.cloud.nacos.config.group=dev
 *      项目使用中：每个微服务创建自己的命名空间，使用配置分组区分环境，dev，test，prod
 *
 * 3. 同时加载多个配置集
 *      1.微服务的任何配置信息，都可以放在配置中心中
 *      2.在bootstrap.properties说明加载配置中心中哪些配置文件即可
 *      3.@Value("${}")，@ConfigurationProperties
 *      以前springboot任何方式从配置文件中获取配置信息，只能获取指定的配置信息
 *
 */


@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"})
@MapperScan("com.atguigu.modules.coupon.dao")
@EnableDiscoveryClient
public class GulimailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailCouponApplication.class, args);
    }

}