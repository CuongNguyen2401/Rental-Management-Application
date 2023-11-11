package test;

import entity.Type;
import entity.User;
import entity.UserFactory;

public class main {
	public static void main(String[] args) {
		User user = UserFactory.getUser(Type.Tenant);
		user.setEmail("cl");
		System.out.println(user.getEmail());
	}

}
