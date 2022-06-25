package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication  implements CommandLineRunner{
	
	@Autowired
private UserService userService;
	public static void main(String[] args) {
	
		SpringApplication.run(ExamserverApplication.class, args);
	
		
	
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
		// TODO Auto-generated method stub
		/*User user=new User();
		user.setFirstname("Surya");
		user.setLastname("Singh");
		user.setUsername("kiro");
		user.setPassword("");
		user.setEmail("raunakc6@gmail.com");
		
		Role role1=new Role();
		role1.setRoleId(44L);
		role1.setRolename("ADMIN");	
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		
		//userRoleSet.add(userRole);
		User user1 = this.userService.createUser(user,userRoleSet);
		System.out.println(user1.getUsername());*/
	}

}