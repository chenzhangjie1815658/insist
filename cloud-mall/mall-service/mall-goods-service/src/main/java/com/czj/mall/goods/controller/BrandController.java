package com.czj.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czj.mall.goods.model.Brand;
import com.czj.mall.goods.service.BrandService;
import com.czj.mall.util.RespCode;
import com.czj.mall.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：chenzj
 * @date ：Created in 2022/6/16 23:17
 * @description：品牌入口
 * @modified By：
 * @version: 1.0$
 */
@RestController
@RequestMapping(value="/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping
    public RespResult add(@RequestBody Brand brand){
        brandService.save(brand);
        return  new RespResult(0);
    }

    @PutMapping
    public RespResult update(@RequestBody Brand brand){
        brandService.updateById(brand);
        return  new RespResult(0);
    }

    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable("id") String id){
        brandService.removeById(id);
        return new RespResult(0);
    }

    @GetMapping("/{id}")
    public RespResult queryById(@PathVariable("id") String id){
        Brand brand = brandService.getById(id);
        return new RespResult(brand,RespCode.SUCCESS);
    }


    /****
     * 条件查询
     */
    @PostMapping(value = "/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand){
        List<Brand> brands = brandService.queryList(brand);
        return RespResult.ok(brands);
    }

    /****
     * 条件查询
     */
    @PostMapping(value = "/search/{page}/{size}")
    public RespResult<Page<Brand>> queryPageList(
            @PathVariable(value = "page")Long page,
            @PathVariable(value = "size")Long size,
            @RequestBody Brand brand){
        Page<Brand> pageInfo = brandService.queryPageList(brand,page,size);
        return RespResult.ok(pageInfo);
    }


}
