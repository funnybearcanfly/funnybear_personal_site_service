package com.funnybear.siteService.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.funnybear.siteService.model.Post;

public class PostDAOImpl implements PostDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Post> list(){
		Session session = this.sessionFactory.openSession();
		List<Post> personList = session.createQuery("from Post").list();
		session.close();
		return personList;
	}
}
