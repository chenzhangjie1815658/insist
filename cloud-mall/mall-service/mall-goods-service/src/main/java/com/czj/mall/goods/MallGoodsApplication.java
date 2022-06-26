package com.czj.mall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：chenzj
 * @date ：Created in 2022/6/16 21:52
 * @description：启动类
 * @modified By：
 * @version: 1.0$
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.czj.mall.goods.mapper"})
public class MallGoodsApplication {



    public static void main(String[] args) {
        SpringApplication.run(MallGoodsApplication.class,args);
    }

}
