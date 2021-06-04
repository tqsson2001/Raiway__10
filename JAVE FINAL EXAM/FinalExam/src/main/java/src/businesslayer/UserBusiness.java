package src.businesslayer;

import java.util.ArrayList;
import java.util.Base64;

import src.constants.ErrorCode;
import src.datalayer.IUserRepository;
import src.datalayer.UserRepository;
import src.entity.Manager;
import src.entity.User;



public class UserBusiness implements IUserBusiness{
	IUserRepository userRepository;
	
	public UserBusiness() {
		userRepository = new UserRepository();
	}
	
	
	@Override
	public ArrayList<User> getUser(int id) {
		return userRepository.getUser(id);
	}

	@Override
	public ArrayList<Manager> getListManager() {
		// TODO Auto-generated method stub
		return userRepository.getListManager();
	}

	@Override
	public ArrayList<User> getListUsers() {
		// TODO Auto-generated method stub
		return userRepository.getListUsers();
	}


	@Override
	public ArrayList<User> getListUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
