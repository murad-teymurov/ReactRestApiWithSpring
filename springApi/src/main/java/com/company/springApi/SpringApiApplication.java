package com.company.springApi;

import com.company.springApi.model.User;
import com.company.springApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(SpringApiApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Murad", "Teymurov","muradteymurov@gmail.com"));
		this.userRepository.save(new User("Elman", "Murselov","elmanmurselov@gmail.com"));
		this.userRepository.save(new User("Ilkin", "Miriyev","ilkinmiriyev@gmail.com"));
		this.userRepository.save(new User("test", "test","test@gmail.com"));
	}
}
