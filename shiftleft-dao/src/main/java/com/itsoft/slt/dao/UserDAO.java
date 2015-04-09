package com.itsoft.slt.dao;

import java.util.List;

import javax.ejb.Local;

import com.itsoft.slt.entities.User;

@Local
public interface UserDAO {
	
	List<User> findAll();

	User findById(User t);

	void save(User t);

	void update(User t);

	void delete(User t);
}
