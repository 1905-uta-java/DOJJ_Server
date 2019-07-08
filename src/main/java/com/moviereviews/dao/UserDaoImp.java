package com.moviereviews.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.moviereviews.models.User;
import com.moviereviews.util.HibernateUtil;

public class UserDaoImp implements UserDao{

	// Get all of the users in the database
	@Override
	public List<User> getUsers() {
		Session s = HibernateUtil.getSession();
		Query<User> que = s.createQuery("from User", User.class);
		List<User> users = que.list();
		s.close();
		return users;
	}

	// Get a specific user by their email
	@Override
	public User getUserByEmail(String email) {
		Session s = HibernateUtil.getSession();
		User u = s.get(User.class, email);
		s.close();
		return u;
	}

	// Get a specific user by their username
	@Override
	public User getUserByUsername(String un) {
		Session s = HibernateUtil.getSession();
		Query<User> que = s.createQuery("from User where username=:un", User.class);
		que.setParameter("un", un);
		List<User> revs = que.list();
		s.close();
		return revs.get(0);
	}

	// Update the user in the database using new information
	@Override
	public int updateUser(User u) {
		Session s = HibernateUtil.getSession();
		Transaction tran = s.beginTransaction();
		s.merge(u);
		tran.commit();
		s.close();
		return 0;
	}

	// Create a new user in the database
	@Override
	public void createUser(User u) {
		System.out.println(u.toString());
		Session s = HibernateUtil.getSession();
		Transaction tran = s.beginTransaction();
		s.persist(u);
		tran.commit();
		s.close();
	}

	// Delete a user from the database
	@Override
	public int deleteUser(String email) {
		Session s = HibernateUtil.getSession();
		Transaction tran = s.beginTransaction();
		s.delete(new User(email));
		tran.commit();
		s.close();
		return 0;
	}

}
