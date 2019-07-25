package com.aaa.house.service;

import com.aaa.house.dao.HouseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: 曹晓强
 * @Date: 2019-07-24 11:31
 * @Wish: 愿你出走半生，归来仍是少年
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseDao houseDao;

    @Override
    public List<Map> getList() {
        return houseDao.getList();
    }

    @Override
    public Map getById(int id) {
        List<Map>mapList=houseDao.getById(id);
        if (mapList!=null&&mapList.size()>0){
            return mapList.get(0);
        }
        return null;
    }
}
