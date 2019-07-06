package com.moviereviews.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.moviereviews.models.Review;
import com.moviereviews.util.HibernateUtil;

public class ReviewDaoImp implements ReviewDao {

	// Get all of the reviews in the database
	@Override
	public List<Review> getReviews() {
		Session s = HibernateUtil.getSession();
		Query<Review> que = s.createQuery("from Review", Review.class);
		List<Review> revs = que.list();
		s.close();
		return revs;
	}

	// Get all of the reviews in the database sorted by the date of creation
	@Override
	public List<Review> getReviewsByRecent() {
		Session s = HibernateUtil.getSession();
		Query<Review> que = s.createQuery("from Review r order by r.created", Review.class);
		List<Review> revs = que.list();
		s.close();
		return revs;
	}

	// Get all of the reviews for the specified movie
	@Override
	public List<Review> getReviewsByMovie(int mId) {
		Session s = HibernateUtil.getSession();
		Query<Review> que = s.createQuery("from Review where movieid=:mId", Review.class);
		que.setParameter("mId", mId);
		List<Review> revs = que.list();
		s.close();
		return revs;
	}
	
	// Get all of the reviews created by the specified user
	@Override
	public List<Review> getReviewsByUser(String username) {
		Session s = HibernateUtil.getSession();
		Query<Review> que = s.createQuery("from Review where username=:username", Review.class);
		que.setParameter("username", username);
		List<Review> revs = que.list();
		s.close();
		return revs;
	}

	// Update the specified review with the given information
	@Override
	public int updateReview(Review r) {
		Session s = HibernateUtil.getSession();
		Transaction tran = s.beginTransaction();
		s.merge(r);
		tran.commit();
		s.close();
		return 0;
	}

	// Create a new review in the database
	@Override
	public int createReview(Review r) {
		Session s = HibernateUtil.getSession();
		Transaction tran = s.beginTransaction();
		int revId = (int) s.save(r);
		tran.commit();
		s.close();
		return revId;
	}

	// Delete the specified review from the database
	@Override
	public int deleteReview(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tran = s.beginTransaction();
		s.delete(new Review(id));
		tran.commit();
		s.close();
		return 0;
	}

}
