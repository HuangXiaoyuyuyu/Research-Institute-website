package org.dao;

import java.util.List;

import javassist.expr.NewArray;

import org.vo.News;

public interface NewsDao {
	public List queryAllNews();
	public News selectNews(Integer id);
	public void addNews(News news);
	public void deleteNews(Integer id);
	public void updateNews(News news);
}
