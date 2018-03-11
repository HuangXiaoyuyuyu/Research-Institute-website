package org.action;

import java.util.List;
import java.util.Map;

import org.dao.NewsDao;
import org.vo.News;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NewsAction extends ActionSupport{
	private News news;
	private NewsDao newsDao;
	public NewsAction() {
		super();
	}
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
	}
	public NewsDao getNewsDao() {
		return newsDao;
	}
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}
	
	public String queryAllNews() throws Exception{
		List list = newsDao.queryAllNews();
		Map session = (Map) ActionContext.getContext().get("session");
		
		session.put("newslist", list);
		return SUCCESS;
	}
	
	public String selectNews() throws Exception{
		News n = newsDao.selectNews(news.getId());
		if(n==null){
			return INPUT;
		}
		Map session = (Map) ActionContext.getContext().get("session");
		session.put("onenews", n);
		return SUCCESS;
	}
	
	public String addNews() throws Exception{
		News n = new News();
		n.setId(news.getId());
		n.setTitle(news.getTitle());
		n.setContent(news.getContent());
		n.setTime(news.getTime());
		
		newsDao.addNews(n);
		queryAllNews();
		return SUCCESS;
	}
	
	public String deleteNews() throws Exception{
		newsDao.deleteNews(news.getId());
		queryAllNews();
		return SUCCESS;
	}
	
	public String updateNews() throws Exception{
		News n = (News)newsDao.selectNews(news.getId());
		if(n==null){
			return INPUT;
		}
		n.setId(news.getId());
		n.setTitle(news.getTitle());
		n.setContent(news.getContent());
		n.setTime(news.getTime());
		newsDao.updateNews(n);
		queryAllNews();
		return SUCCESS;
	}
}
