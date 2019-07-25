package com.aaa.house.service;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author: 曹晓强
 * @Date: 2019-07-24 11:30
 * @Wish: 愿你出走半生，归来仍是少年
 */
public interface HouseService {
    /**
     * 查询列表
     * @return
     */

    List<Map> getList();

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    Map getById(int id);
}
