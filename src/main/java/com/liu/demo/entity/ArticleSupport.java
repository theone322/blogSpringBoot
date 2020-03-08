package com.liu.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
	
public class ArticleSupport {
	@Id
	@GeneratedValue   //自动增长
	private int supportID;
	private String userID;
	private int articleID;
	public int getSupportID() {
		return supportID;
	}
	public void setSupportID(int supportID) {
		this.supportID = supportID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getArticleID() {
		return articleID;
	}
	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}
	
	
	
}
