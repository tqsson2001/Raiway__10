package src.businesslayer;

import java.util.ArrayList;
import java.util.Base64;

import src.constants.ErrorCode;
import src.datalayer.IUserRepository;
import src.datalayer.UserRepository;
import src.entity.User;



public class UserBusiness implements IUserBusiness{
	IUserRepository userRepository;
	
	public UserBusiness() {
		userRepository = new UserRepository();
	}
	
	
	public ArrayList<User> getListUser() {
		return userRepository.getListUser();
	}

	public User getUser(int id) throws Exception {
		if (id < 0) {
			throw new Exception(ErrorCode.ERROR_100_MSG);
		}
		User user = userRepository.getUser(id);
		if (user == null) {
			System.out.println("id User không có trong danh sách");
			return user;
		}
		return user;
	}

	public User getUser(String userName, String password) {
		User user = null;
		for (User u : userRepository.getListUser()) {
			
			if (u.getUserName().trim().equals(userName.trim())) {
				System.out.println("username = " + userName +" + dataUserName = "+ u.getUserName());
				return u;
			}
		}
		return user;
	}
	
	public boolean insertUser(String username, String password) {
		 
		byte[] newPwByte = Base64.getDecoder().decode(password);
		String passwordDecode = new String(newPwByte);
		
		return false;
	}
	
}
