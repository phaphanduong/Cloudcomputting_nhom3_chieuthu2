package com.vietanh.springboot.admin.dao;

import java.util.List;

import com.vietanh.springboot.admin.entity.Post;

public interface PostDao {
	void addPost(Post post);

	void updatePost(Post post);

	void deletePost(Post post);

	Post getPostByID(Long id);

	List<Post> getAllPost();
	
	List<Post> getAllPostByCategoryID(Long id);
}
