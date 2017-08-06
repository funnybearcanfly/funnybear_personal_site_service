package com.funnybear.siteService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.funnybear.siteService.dao.PostDAO;
import com.funnybear.siteService.model.Post;

@RestController
@RequestMapping("/api")
public class PostController {
	@Autowired
	private PostDAO postDAO;

	@RequestMapping(value = "/listAllPosts", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Post> listAllPosts() {
		List<Post> posts = postDAO.list();
		return posts;
	}
}