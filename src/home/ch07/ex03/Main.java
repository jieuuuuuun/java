package home.ch07.ex03;

import home.ch07.ex03.dao.UserDao;
import home.ch07.ex03.dao.UserDaoImpl;
import home.ch07.ex03.presentation.Console;
import home.ch07.ex03.presentation.UserIo;
import home.ch07.ex03.service.UserService;
import home.ch07.ex03.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.play();
		Console.info("end.");
	}
}
