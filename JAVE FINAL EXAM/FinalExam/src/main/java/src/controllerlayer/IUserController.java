package src.controllerlayer;

import java.util.ArrayList;

import src.entity.Manager;
import src.entity.User;

public interface IUserController {
	public ArrayList<User> getUser(int id);

	public ArrayList<Manager> getListManager();

	public ArrayList<User> getListUsers();
}
