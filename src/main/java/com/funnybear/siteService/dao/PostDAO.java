package com.funnybear.siteService.dao;

import java.util.List;

import com.funnybear.siteService.model.Post;

public interface PostDAO {
	public List<Post> listWithoutContent();
	public Post getPost(int id);
}
