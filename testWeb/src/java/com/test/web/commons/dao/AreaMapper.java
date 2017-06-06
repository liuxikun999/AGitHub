package com.test.web.commons.dao;

import com.test.web.commons.bean.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(String code);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}