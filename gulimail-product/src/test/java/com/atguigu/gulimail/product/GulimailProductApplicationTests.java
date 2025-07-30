package com.atguigu.gulimail.product;

import com.atguigu.modules.product.entity.BrandEntity;
import com.atguigu.modules.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.atguigu.modules.product.GulimailProductApplication.class)
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("测试");
        brandService.save(brandEntity);
        System.out.println("保存成功");

    }

}
