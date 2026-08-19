package service;

import model.User;
import userDao.userDao;

public class UserService {

	userDao dao = new userDao();

	public boolean saveUser(User user) {

		if (dao.isUserExist(user.getUsername())) {

			return false;
		}
		System.out.println("username not exist");

		return dao.registerUser(user);

	}

	public boolean isValidUser(String username, String password) {

		System.out.println("Username entered : [" + username + "]");
		System.out.println("Password entered : [" + password + "]");

		boolean exists = dao.isUserExist(username);

		System.out.println("User exists : " + exists);

		if (exists) {

			boolean passwordValid = dao.validatePassword(username, password);

			System.out.println("Password valid : " + passwordValid);

			return passwordValid;
		}

		return false;
	}

	public boolean updateUser(String username, String password, String email, String phone) {

		return dao.updateUser(username, password, email, phone);
	}
	public boolean deleteUser(String username) {

	    return dao.deleteUser(username);
	}
}
