//package com.miit.user.servicesTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.miit.user.entites.User;
//import com.miit.user.repo.UserRepository;
//import com.miit.user.services.UserServices;
//
///**
// * @author  -MiIT Tech 
// *
// */
//@SpringBootTest
//public class UserServicesTest {
//
//	@Mock
//	UserRepository userRepository;
//
//	@InjectMocks
//	UserServices userServices;
//
//	public List<User> users;
//
//	@Test
//	public void getAllUsers() {
//		List<User> users = new ArrayList<User>();
//		users.add(new User("Jhon", "Might's Watch"));
//		users.add(new User("Tyrion", "Westeros"));
//
//		when(userRepository.findAll()).thenReturn(users); // Mocking the DB
//
//		assertEquals(2, userServices.getUsers().size());
//	}
////kc
////	@Test
////	public void getUserById() {
////		List<User> users = new ArrayList<User>();
////		users.add(new User(5, "Arya", "Winterfell"));
////	    users.add(new User(8, "Daenerys", "Pentos"));
////		
////		long id = 8;
////		when(userRepository.findAll()).thenReturn(users);
////		assertEquals(id, userServices.getUserById(id).getId());
////	}
//
//	@Test
//	public void add() {
//		User user = new User("Daenerys", "Pentos");
//		when(userRepository.save(user)).thenReturn(user);
//		assertEquals(user, userServices.add(user));
//	}
//
//	@Test
//	public void update() {
//		User user = new User("Cersei", "King's Landing");
//		when(userRepository.save(user)).thenReturn(user);
//		assertEquals(user, userServices.updateUser(user, 10));
//	}
//	
//	@Test
//	public void delete() {
//		User user = new User("Cersei", "King's Landing");
//		userServices.delete(10);
//		verify(userRepository,times(1)).deleteById((long) 10);
//		
//	}
//}
