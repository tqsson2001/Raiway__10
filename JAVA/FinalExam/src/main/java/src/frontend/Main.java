package src.frontend;

import java.util.List;

import src.controllerlayer.UserController;
import src.entity.User;

public class Main {
	public static void main(String[] args) {
		
		UserController userController = new UserController();
		
		
		List<User> users = userController.getListUser();
		
		for (User user : users) {
			System.out.println(users);
			}
		
		System.out.println(userController.getUser(1));
		
		
		
	}
}
