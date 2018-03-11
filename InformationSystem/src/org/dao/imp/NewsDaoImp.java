package org.dao.imp;

import java.util.List;

import org.dao.NewsDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.vo.News;

public class NewsDaoImp implements NewsDao{
	SessionFactory hibernateSessionFactory;
	
	public void setHibernateSessionFactory(SessionFactory hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}

	@Override
	public List queryAllNews() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		List list = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from News");
			list = query.list();
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public News selectNews(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		News news = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from News where id='"+id+"'");
			news = (News) query.uniqueResult();
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		return news;
	}

	@Override
	public void addNews(News news) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.save(news);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void deleteNews(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			News news = (News)this.selectNews(id);
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.delete(news);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void updateNews(News news) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.update(news);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
	}

}
