package com.itsoft.slt.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.itsoft.slt.dao.UserDAO;
import com.itsoft.slt.entities.User;
import com.itsoft.slt.service.IServiceLocal;
import com.itsoft.slt.service.IServiceRemote;

@Stateless
public class UserServiceImpl implements IServiceRemote<User>,
		IServiceLocal<User> {

	@EJB(mappedName = "UserDAOImpl")
	private UserDAO userDao;

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findById(User t) {
		return userDao.findById(t);
	}

	@Override
	public void insert(User t) {
		userDao.save(t);
	}

	@Override
	public void update(User t) {
		userDao.update(t);
	}

	@Override
	public void delete(User t) {
		userDao.delete(t);
	}

}
