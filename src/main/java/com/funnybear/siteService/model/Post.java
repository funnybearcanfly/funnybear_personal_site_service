package com.funnybear.siteService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="authur_id")
	private int authurId;
	@Column(name="last_modified_time")
	private Date lastModifiedTime;
	@Column(name="title")
	private String title;
	@Column(name="content")
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthurId() {
		return authurId;
	}

	public void setAuthurId(int authurId) {
		this.authurId = authurId;
	}

	public Date getLastUpdatedTime() {
		return lastModifiedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastModifiedTime = lastUpdatedTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
