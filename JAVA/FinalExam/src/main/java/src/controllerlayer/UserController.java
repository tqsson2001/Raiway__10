package src.controllerlayer;

import java.util.ArrayList;

import src.businesslayer.IUserBusiness;
import src.businesslayer.UserBusiness;
import src.entity.User;


public class UserController implements IUserController{
	IUserBusiness userBusiness;
	
	public UserController() {
		userBusiness = new UserBusiness();
	}

	public ArrayList<User> getListUser() {
		return userBusiness.getListUser();
	}

	public User getUser(int id) {
		try {
			return userBusiness.getUser(id);
		} catch (Exception e) {
			System.out.println("UserController ERROR _MSG = " + e.getMessage());
			return null;
		}
	}

	public User getUser(String userName, String password) {
		User user = userBusiness.getUser(userName, password);
		return user;
	}

	
}
