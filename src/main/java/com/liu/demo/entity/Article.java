package com.liu.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Article {
	
	
	@Id
	@GeneratedValue   //自动增长
    private int articleID;
    private String articleTitle;
    private int typeID;

	private String userID;
    private String content;
    private String launchTime;
    
    private boolean articlePublic;
    private boolean articleComment;
    
    private boolean articleDraft;
    private boolean articleBlock;
	public int getArticleID() {
		return articleID;
	}
	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLaunchTime() {
		return launchTime;
	}
	public void setLaunchTime(String launchTime) {
		this.launchTime = launchTime;
	}
	public boolean isArticlePublic() {
		return articlePublic;
	}
	public void setArticlePublic(boolean articlePublic) {
		this.articlePublic = articlePublic;
	}
	public boolean isArticleComment() {
		return articleComment;
	}
	public void setArticleComment(boolean articleComment) {
		this.articleComment = articleComment;
	}
	public boolean isArticleDraft() {
		return articleDraft;
	}
	public void setArticleDraft(boolean articleDraft) {
		this.articleDraft = articleDraft;
	}
	public boolean isArticleBlock() {
		return articleBlock;
	}
	public void setArticleBlock(boolean articleBlock) {
		this.articleBlock = articleBlock;
	}


    
    
}
