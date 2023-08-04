package com.kkankkandev.rest.webservice.restfulwebservice.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	private static Integer usersCount = 0;

	static {
		users.add(new User(++usersCount,"Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"Eve", LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount,"Jim", LocalDate.now().minusYears(30)));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}

	public User findOne(int id) {
//		for(User ele : users){
//			if (ele.getId() == id){
//				return ele;
//			}
//		}
//		return null;

		Predicate<? super User> predicate = user -> user.getId().equals(id);
		//		System.out.println(predicate + "KKamJiDa");
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
