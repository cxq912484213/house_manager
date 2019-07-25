package com.aaa.house.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: 曹晓强
 * @Date: 2019-07-24 11:25
 * @Wish: 愿你出走半生，归来仍是少年
 */
@Repository
public interface HouseDao {

    /**
     * 查询列表
     * @return
     */
    @Select("select * from house")
    List<Map> getList();

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    @Select("select * from house where id=#{id}")
    List<Map>getById(int id);
}
