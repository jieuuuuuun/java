package ch07.ex02.service;

import ch07.ex02.domain.User;

public interface UserService {
	public User getUser();//user를 읽다.
}
//여기서 User는업무명
//프레젠테이션의 디펜더시가 될수있기때문에 인터페이스로만들었다.