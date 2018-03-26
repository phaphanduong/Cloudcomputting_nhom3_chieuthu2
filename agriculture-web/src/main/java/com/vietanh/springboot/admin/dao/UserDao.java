package com.vietanh.springboot.admin.dao;

import com.vietanh.springboot.admin.entity.UserLocal;

public interface UserDao {
	UserLocal getUserByUsername(String username);
}
