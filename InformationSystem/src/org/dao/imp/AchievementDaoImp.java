package org.dao.imp;

import java.util.List;

import org.dao.AchivevmentDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.vo.Achievement;

public class AchievementDaoImp implements AchivevmentDao
{	SessionFactory hibernateSessionFactory;
	
	public void setHibernateSessionFactory(SessionFactory hibernateSessionFactory) {
	this.hibernateSessionFactory = hibernateSessionFactory;
}


	@Override
	public List queryAllAchievement() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		List list = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Achievement");
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
	public Achievement selectAchievement(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		Achievement achievement = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Achievement where id='"+id+"'");
			achievement = (Achievement) query.uniqueResult();
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
			}
		}
		return achievement;
	}


	@Override
	public void addAchievement(Achievement achievement) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.save(achievement);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
	}


	@Override
	public void deleteAchievement(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			Achievement achievement = (Achievement)this.selectAchievement(id);
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.delete(achievement);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
	}


	@Override
	public void updateAchievement(Achievement achievement) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.update(achievement);
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		
	}

}
