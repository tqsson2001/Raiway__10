package src.datalayer;

import java.util.ArrayList;

import src.entity.Manager;
import src.entity.User;

public interface IUserRepository {
	public ArrayList<User> getUser(int id);

	public ArrayList<Manager> getListManager();

	public ArrayList<User> getListUsers();
	
}
