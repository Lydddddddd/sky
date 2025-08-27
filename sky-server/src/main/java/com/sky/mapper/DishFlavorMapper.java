package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    /**
     * 插入口味
     * @param dishFlavors
     */
    void insert(List<DishFlavor> dishFlavors);

    /**
     * 根据dishId删除口味
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id = #{id}")
    void deleteByDishId(Long dishId);
}
