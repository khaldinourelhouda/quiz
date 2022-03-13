package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication  implements CommandLineRunner{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}
	
	@Override
	public void run  (String ... args)throws Exception{
		System.out.println("starting code");
		
			//User user = new User();
		
	       // user.setFirstName("nour");
		   //user.setLastName("houda");
		//	user.setUsername("nour2021");
			//user.setPassword(this.bCryptPasswordEncoder.encode("nour2021"));
			//user.setProfile("default.png");
		
			//Role role1 = new Role();
			//role1.setRoleId(4l);
		//role1.setRoleName("Admin");
		
			//Set<UserRole> userRoles = new HashSet<>();
		//UserRole userRole = new UserRole();
		
		//userRole.setRole(role1);
		//	userRole.setUser(user);
		
			//userRoles.add(userRole);
		
			//User user1 =this.userService.createUser(user, userRoles);
			//System.out.println(user1.getUsername());
	}

}
