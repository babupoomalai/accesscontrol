package accesscontrol.service;

import accesscontrol.models.User;
import accesscontrol.models.UserType;

public class UserService {

	public User createUser(String id, String name) {
		return new User(id, UserType.USER, name);
	}

	public User createAdmin(String id, String name) {
		return new User(id, UserType.ADMIN, name);
	}

}
