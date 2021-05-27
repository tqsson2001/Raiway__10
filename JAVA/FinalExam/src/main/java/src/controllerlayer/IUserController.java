package src.controllerlayer;

import java.util.ArrayList;

import src.entity.User;

public interface IUserController {
	public ArrayList<src.entity.User> getListUser();
	public User getUser(int id);
	public User getUser(String userName, String password);
}
