package src.businesslayer;

import java.util.ArrayList;

import src.entity.Manager;
import src.entity.User;

public interface IUserBusiness {
	public ArrayList<User> getListUser();
	
	public ArrayList<Manager> getListManager();
	
	public ArrayList<User> getUser(int id);

	ArrayList<User> getListUsers();
}
