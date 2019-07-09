package com.moviereviews.models;

public class UserAndReview {
	private User u;
	private Review r;
	
	public UserAndReview() {
		super();
	}
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public Review getR() {
		return r;
	}
	public void setR(Review r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "UserAndReview [u=" + u + ", r=" + r + "]";
	}
}
