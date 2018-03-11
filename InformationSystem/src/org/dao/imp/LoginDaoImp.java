package org.dao.imp;

import org.dao.LoginDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.vo.Login;

public class LoginDaoImp implements LoginDao{
	SessionFactory hibernateSessionFactory;
	
	public void setHibernateSessionFactory(SessionFactory hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}

	@Override
	public Login checkLogin(String name, String password) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		Login login = null;
		try{
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Login where name='"+name+"'and password='"+password+"'");
			login=(Login) query.uniqueResult();
			tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return login;
	}

}
