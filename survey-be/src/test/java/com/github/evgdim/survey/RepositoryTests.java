package com.github.evgdim.survey;

import com.github.evgdim.survey.domain.User;
import com.github.evgdim.survey.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void userRepository() {
//		Optional<User> user = this.userRepository.find(1L);
//		Assert.assertTrue(!user.isPresent());
	}

}
