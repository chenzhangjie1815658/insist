package com.czj.mall.config.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @author ：chenzj
 * @date ：Created in 2022/6/17 22:24
 * @description：mybatisPlus配置
 * @modified By：
 * @version: $
 */
public class MysqlPlusPageConfig {
    /****
     * 分页拦截器
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        // 设置数据类型
        return  new PaginationInterceptor().setDbType(DbType.MYSQL);
    }
}
