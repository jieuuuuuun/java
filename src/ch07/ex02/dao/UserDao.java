package ch07.ex02.dao;

import ch07.ex02.domain.User;

public interface UserDao {
	public User selectUser();
}
//읽는것은 select로 약속한다.