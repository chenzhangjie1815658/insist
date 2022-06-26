package com.czj.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czj.mall.goods.mapper.BrandMapper;
import com.czj.mall.goods.model.Brand;
import com.czj.mall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：chenzj
 * @date ：Created in 2022/6/16 23:21
 * @description：brand服务类
 * @modified By：
 * @version: 1.0$
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * create by: chenzj
     * description: 按条件查询
     * create time: 2022/6/17 22:16
     *
      * @Param: brand
     * @return List<Brand>
     */
    @Override
    public List<Brand> queryList(Brand brand) {
        return brandMapper.selectList(new QueryWrapper<Brand>().lambda()
                .like(Brand::getName,brand.getName())
        );
    }

    /**
     * create by: chenzj
     * description: 分页查询
     * create time: 2022/6/17 22:16
     *
      * @Param: null
     * @return Page<Brand>
     */
    @Override
    public Page<Brand> queryPageList(Brand brand, Long page, Long size) {
        return brandMapper.selectPage(new Page<>(page, size),
                new QueryWrapper<Brand>().lambda().like(Brand::getName,brand.getName()));
    }
}
