package src.businesslayer;

import java.util.ArrayList;

import src.entity.User;

public interface IUserBusiness {
	public ArrayList<User> getListUser();
	public User getUser(int id) throws Exception;
	public User getUser(String userName, String password);
}
