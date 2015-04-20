package com.springmvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.model.News;
import com.springmvc.service.NewsService;

@Controller
@RequestMapping("/newsController")
public class NewsController {

	private NewsService newsService;

	public NewsService getNewsService() {
		return newsService;
	}

	@Autowired
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	@RequestMapping("show")
	@ResponseBody
	public Map<String, Object> showNews(){
		
	System.out.println(11);
	List<News> listNews = newsService.showOnePageNews();
	
	Map<String, Object> modelMap = new HashMap<String, Object>();  
	
	modelMap.put("total", listNews.size());
	modelMap.put("data", listNews);
	modelMap.put("success", "true");
	return modelMap;
	}
	
}
