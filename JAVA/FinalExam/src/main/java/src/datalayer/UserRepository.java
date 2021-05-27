package src.datalayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import src.entity.User;
import utils.JDBCUtil;


public class UserRepository implements IUserRepository{

	public ArrayList<User> getListUser() {
		ArrayList<User> listUsers = new ArrayList();
		String sqlQuery = "SELECT * FROM `User`";

		try {
			ResultSet resultSet = JDBCUtil.getIntance().executeQuery(sqlQuery);
			while (resultSet.next()) {

				User u = new User(resultSet.getInt("id"), resultSet.getString("fullName"),
						resultSet.getString("email"), resultSet.getString("passWord"));
				listUsers.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listUsers;
	}

	public User getUser(int id) {
		User user = null;
		String sqlQueryString = "SELECT * FROM `User` WHERE id = " + id;

		try {
			ResultSet resultSet = JDBCUtil.getIntance().executeQuery(sqlQueryString);
			while (resultSet.next()) {
				user = new User(resultSet.getInt("id"), resultSet.getString("fullName"),
						resultSet.getString("password"), resultSet.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	

	public User getUser(String userName, String password) {
		User user = null;
		String sqlQueryString = "SELECT * FROM `User` WHERE `username` = '" + userName.trim() +"'";
		
		try {
			ResultSet resultSet = JDBCUtil.getIntance().executeQuery(sqlQueryString);
			while (resultSet.next()) {
				user = new User(resultSet.getInt("id"), resultSet.getString("fullName"),
						resultSet.getString("password"), resultSet.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public User deleteUser(int id) {
		User user = null;
		String sqlQueryString = "DELETE FROM `user` WHERE id = " + id;

		try {
			ResultSet resultSet = JDBCUtil.getIntance().executeQuery(sqlQueryString);
			while (resultSet.next()) {
				user = new User(resultSet.getInt("id"), resultSet.getString("fullName"),
						resultSet.getString("password"), resultSet.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
		
	}

	public void updateProject(int id, String userName) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(int id, String userName) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
