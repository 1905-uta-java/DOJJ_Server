package com.moviereviews.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="REVIEWS")
public class Review implements Serializable{

	// Serial ID
	private static final long serialVersionUID = 7074954107112393018L;
	
	// Attributes for Review object
	@Id @GeneratedValue
	@Column(name="REVIEW_ID", nullable=false)
	private int id;
	
	@Column(name="USERNAME")
	private String username;
	@Column(name="REVIEW_CONTENT")
	private String reviewContent;
	@Column(name="MOVIE_ID", nullable=false)
	private int movieId;
	private int rating;
	@Column(name="USER_SCORE")
	private int userScore;
	private Date created;
	
	// Constructors
	public Review() {
		super();
	}

	public Review(int id, String username, String reviewContent, int movieId, int rating, int userScore, Date created) {
		super();
		this.id = id;
		this.username = username;
		this.reviewContent = reviewContent;
		this.movieId = movieId;
		this.rating = rating;
		this.userScore = userScore;
		this.created = created;
	}
	
	public Review(int id) {
		super();
		this.id = id;
	}

	// Getters and Setters for Attributes
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserEmail() {
		return username;
	}

	public void setUserEmail(String username) {
		this.username = username;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getUserScore() {
		return userScore;
	}

	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	// Hash Code Method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + id;
		result = prime * result + movieId;
		result = prime * result + rating;
		result = prime * result + ((reviewContent == null) ? 0 : reviewContent.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + userScore;
		return result;
	}

	// Equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (id != other.id)
			return false;
		if (movieId != other.movieId)
			return false;
		if (rating != other.rating)
			return false;
		if (reviewContent == null) {
			if (other.reviewContent != null)
				return false;
		} else if (!reviewContent.equals(other.reviewContent))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (userScore != other.userScore)
			return false;
		return true;
	}

	// To String Method
	@Override
	public String toString() {
		return "Review [id=" + id + ", username=" + username + ", reviewContent=" + reviewContent + ", movieId="
				+ movieId + ", rating=" + rating + ", userScore=" + userScore + ", created=" + created + "]";
	}
	
}
