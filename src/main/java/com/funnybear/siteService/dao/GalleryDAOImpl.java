package com.funnybear.siteService.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import com.funnybear.siteService.model.GalleryEntry;

public class GalleryDAOImpl implements GalleryDAO{
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<GalleryEntry> listGalleryEntries() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(GalleryEntry.class)
				.addOrder(Order.desc("id"));

		List<GalleryEntry> posts = cr.list();

		session.close();
		return posts;
	}

}
