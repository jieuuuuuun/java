package home.ch07.ex02;

import home.ch07.ex02.dao.UserDao;
import home.ch07.ex02.dao.UserDaoImpl;
import home.ch07.ex02.persentation.Console;
import home.ch07.ex02.persentation.UserIo;
import home.ch07.ex02.service.UserService;
import home.ch07.ex02.service.UserServiceImpl;

public class Main {
	public static void main(String[]args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		Console.info("start");
		userIo.play();
		Console.info("end");
	}
}
