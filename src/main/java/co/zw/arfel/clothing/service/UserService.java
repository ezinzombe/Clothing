package co.zw.arfel.clothing.service;


import co.zw.arfel.clothing.model.User;

import java.util.List;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public List<User> findAll();
}
