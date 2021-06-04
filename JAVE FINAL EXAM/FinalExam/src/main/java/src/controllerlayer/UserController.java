package src.controllerlayer;

import java.util.ArrayList;

import src.businesslayer.IUserBusiness;
import src.businesslayer.UserBusiness;
import src.entity.Manager;
import src.entity.User;


public class UserController implements IUserController{
	IUserBusiness userBusiness;
	
	public UserController() {
		userBusiness = new UserBusiness();
	}

	@Override
	public ArrayList<User> getUser(int id) {
		// TODO Auto-generated method stub
		return userBusiness.getUser(id);
	}

	@Override
	public ArrayList<Manager> getListManager() {
		// TODO Auto-generated method stub
		return userBusiness.getListManager();
	}

	@Override
	public ArrayList<User> getListUsers() {
		// TODO Auto-generated method stub
		return userBusiness.getListUsers();
	}

	
}
