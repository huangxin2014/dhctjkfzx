package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
    
    List<News> selectOnePageNews();
}