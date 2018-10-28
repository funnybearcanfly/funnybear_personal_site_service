package com.funnybear.siteService.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.funnybear.siteService.dao.GalleryDAO;
import com.funnybear.siteService.model.GalleryEntry;

@RestController
@RequestMapping("/api")
public class GalleryController {
	@Autowired
	private GalleryDAO galleryDAO;
	
	@RequestMapping(value = "/listGalleryEntries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<GalleryEntry> listGalleryEntries() {
		List<GalleryEntry> entries = galleryDAO.listGalleryEntries();
		for (GalleryEntry entry : entries) {
			List<String> results = new ArrayList<String>();
			File[] files = new File(entry.getFolderPath() + "/large").listFiles();
			for (File file : files) {
			    if (file.isFile()) {
			        results.add(file.getName());
			    }
			}
			entry.setImagePaths(results);
		}
		return entries;
	}
}