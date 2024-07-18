package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Marcos Low", "marcos@gmail.com", "985856545", "123456");
		User u4 = new User(null, "Alex Blue", "alex@gmail.com", "987575265", "123456");
		User u5 = new User(null, "Maria Mara", "maria@gmail.com", "945953645", "123456");
		User u6 = new User(null, "Marcelo Arruda", "marcelo@gmail.com", "915453695", "123456");
		User u7 = new User(null, "Marta Moreira", "marta@gmail.com", "98851596", "123456");
		User u8 = new User(null, "Moreira Mos", "moreira@gmail.com", "954652595", "123456");
		User u9 = new User(null, "Brown Blus", "brown@gmail.com", "985354125", "123456");
		User u10 = new User(null, "Gordon Nander", "gordon@gmail.com", "975482165", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));
	}

}
