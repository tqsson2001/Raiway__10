package src.datalayer;

import java.util.ArrayList;

import src.entity.User;

public interface IUserRepository {
	public ArrayList<src.entity.User> getListUser();
	public User getUser(int id);
	public User getUser(String userName, String password);
	public User deleteUser(int id);
	public void updateUser(int id, String userName);
	
	
}
