package com.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.NewsMapper;
import com.springmvc.model.News;
import com.springmvc.service.NewsService;

@Service("newsService")
public class NewsServiceImpl implements NewsService {

	private NewsMapper newsMapper;

	public NewsMapper getNewsMapper() {
		return newsMapper;
	}

	@Autowired
	public void setNewsMapper(NewsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	public List<News> showOnePageNews() {
		// TODO Auto-generated method stub
		return newsMapper.selectOnePageNews();
	}

}
