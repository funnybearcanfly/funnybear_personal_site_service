package com.funnybear.siteService.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

import com.funnybear.siteService.model.Post;

public class PostDAOImpl implements PostDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> listWithoutContent() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Post.class)
				.setProjection(Projections.projectionList().add(Projections.property("id"), "id")
						.add(Projections.property("key"), "key")
						.add(Projections.property("authurName"), "authurName")
						.add(Projections.property("lastModifiedTime"), "lastModifiedTime")
						.add(Projections.property("title"), "title")
						.add(Projections.property("tag"), "tag")
						.add(Projections.property("description"), "description"))
				.setResultTransformer(Transformers.aliasToBean(Post.class)).addOrder(Order.desc("id"));

		List<Post> posts = cr.list();

		session.close();
		return posts;
	}

	@Override
	public Post getPost(int id) {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from Post WHERE id=:uid");
		query.setParameter("uid", id);
		Post post = (Post) query.uniqueResult();
		session.close();
		return post;
	}

	@Override
	public Post getPost(String key) {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from Post WHERE key=:ukey");
		query.setParameter("ukey", key);
		Post post = (Post) query.uniqueResult();
		session.close();
		return post;
	}
}
