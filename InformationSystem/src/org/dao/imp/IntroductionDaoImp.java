package org.dao.imp;

import java.util.List;

import org.dao.IntroductionDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.vo.Introduction;
import org.vo.News;

public class IntroductionDaoImp implements IntroductionDao{
	SessionFactory hibernateSessionFactory;
	
	public void setHibernateSessionFactory(SessionFactory hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}

	@Override
	public List queryAllIntroduction() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		List list = null;
		try {
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Introduction");
			list = query.list();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public Introduction selectIntroduction(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		Introduction introduction = null;
		try {
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Introduction where id='"+id+"'");
			introduction = (Introduction)query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		return introduction;
	}

	@Override
	public void addIntroduction(Introduction introduction) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.save(introduction);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void deleteIntroduction(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			Introduction introduction = (Introduction)this.selectIntroduction(id);
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.delete(introduction);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void updateIntroduction(Introduction introduction) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.update(introduction);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
	}

}
