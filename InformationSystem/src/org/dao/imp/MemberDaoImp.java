package org.dao.imp;

import java.util.List;

import org.dao.MemberDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.vo.Member;

public class MemberDaoImp implements MemberDao{
	SessionFactory hibernateSessionFactory;
	

	public void setHibernateSessionFactory(SessionFactory hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}


	@Override
	public List queryAllMember() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		List list = null;
		try {
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Member");
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
	public Member selectMember(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		Member member = null;
		try {
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Member where id='"+id+"'");
			member = (Member)query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
		return member;
	}


	@Override
	public void addMember(Member member) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.save(member);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
	}


	@Override
	public void deleteMember(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			 Member member = (Member)this.selectMember(id);
			 session = hibernateSessionFactory.getCurrentSession();
			 tx = session.beginTransaction();
			 session.delete(member);
		   	 tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
	}


	@Override
	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			session = hibernateSessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			session.update(member);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				e.printStackTrace();
			}
		}
	}

}
