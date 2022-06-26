package com.czj.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：chenzj
 * @date ：Created in 2022/6/16 21:43
 * @description：品牌类
 * @modified By：
 * @version: 1.0$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand implements Serializable {
    // 品牌ID
// MyBatisPlus主键策略注解
    @TableId(type= IdType.AUTO)
    @TableField("id")
    private Integer id;
    // 品牌名字
    @TableField("name")
    private String name;
    // 品牌图片
    @TableField("image")
    private String image;
    // 品牌首字母
    @TableField("initial")
    private String initial;
    // 品牌排序
    @TableField("sort")
    private Integer sort;

}
