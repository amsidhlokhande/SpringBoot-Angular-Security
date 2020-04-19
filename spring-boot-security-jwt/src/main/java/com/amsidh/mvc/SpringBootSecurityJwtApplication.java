package com.amsidh.mvc;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.amsidh.mvc.dto.EnumRole;
import com.amsidh.mvc.dto.Role;
import com.amsidh.mvc.repository.RoleRepository;
import com.amsidh.mvc.repository.UserRepository;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = { UserRepository.class, RoleRepository.class })
public class SpringBootSecurityJwtApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		roleRepository.saveAll(Arrays.asList(new Role(1, EnumRole.ROLE_USER), new Role(2, EnumRole.ROLE_MODERATOR),
				new Role(3, EnumRole.ROLE_ADMIN)));
	}

}
