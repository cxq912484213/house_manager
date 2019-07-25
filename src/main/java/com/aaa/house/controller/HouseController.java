package com.aaa.house.controller;

import com.aaa.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 曹晓强
 * @Date: 2019-07-24 11:37
 * @Wish: 愿你出走半生，归来仍是少年
 */
@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;


    /**
     * 员工列表
     * @return
     */
    @RequestMapping("houseList")
    public Object list(){
        return  houseService.getList();
    }

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    @RequestMapping("houseById")
    public Object getEmp(Integer id){
        return houseService.getById(id);
    }
}
