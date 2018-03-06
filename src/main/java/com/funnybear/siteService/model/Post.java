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
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "key")
	private String key;
	@Column(name = "authur_name")
	private String authurName;
	@Column(name = "last_modified_time")
	private Date lastModifiedTime;
	@Column(name = "title")
	private String title;
	@Column(name = "tag")
	private String tag;
	@Column(name = "category")
	private String category;
	@Column(name = "description")
	private String description;
	@Column(name = "content")
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String getAuthurName() {
		return authurName;
	}

	public void setAuthurName(String authurName) {
		this.authurName = authurName;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
