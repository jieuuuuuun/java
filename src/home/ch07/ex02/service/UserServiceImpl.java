package home.ch07.ex02.service;

import home.ch07.ex02.dao.UserDao;
import home.ch07.ex02.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();	
	}
}
