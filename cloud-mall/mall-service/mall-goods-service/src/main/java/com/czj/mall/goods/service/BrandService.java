package com.czj.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.czj.mall.goods.model.Brand;

import java.util.List;

/**
 * @author ：chenzj
 * @date ：Created in 2022/6/16 23:19
 * @description：brand服务类
 * @modified By：
 * @version: 1.0$
 */
public interface BrandService extends IService<Brand> {

    List<Brand> queryList(Brand brand);

    Page<Brand> queryPageList(Brand brand, Long page, Long size);
}
