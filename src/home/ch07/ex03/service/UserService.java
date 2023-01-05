package home.ch07.ex03.service;

import home.ch07.ex03.domain.User;

public interface UserService {
	public User getUser();
	public void addUser(User user);
	public void fixUser(String userName);
	public void delUser();
}
