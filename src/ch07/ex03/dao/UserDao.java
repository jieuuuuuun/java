package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser();
	public void insertUser(User user);//유저 데이터 추가한다.
	public void updateUser(String userName);//업데이트한다. 수정한다.
	public void deleteUser();//삭제한다
}	
