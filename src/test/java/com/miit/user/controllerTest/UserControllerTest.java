package com.miit.user.controllerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.miit.user.entites.User;
import com.miit.user.services.UserServices;

/**
 * @author MiIT Tech 
 *
 */
@WebMvcTest
public class UserControllerTest {

//	@Autowired
//	MockMvc mockMvc;
//	
//	@MockBean
//	UserServices userServices;
//	
//	@Autowired
//	ObjectMapper objectMpper;
//	
//	User user1 = new User(1, "Jhon", "Night's Watch");
//	User user2 = new User(2, "Tyrion", "Westeros");
//	User user3 = new User(5, "Arya", "Winterfell");
//	User user4 = new User(8, "Daenerys", "Pentos");
//	User user5 = new User(10, "Cersei", "King's Landing");
///*	
//	@Test
//	public void getAllUser_success() throws Exception {
//	    List<User> records = new ArrayList<>(Arrays.asList(user1, user2, user3));
//	    
//	    Mockito.when(userServices.getUsers()).thenReturn(records);
//	    
//	    mockMvc.perform(MockMvcRequestBuilders
//	            .get("/user")
//	            .contentType(MediaType.APPLICATION_JSON))
//	            .andExpect(status().isOk())
//	            .andExpect(jsonPath("$", hasSize(5)))
//	            .andExpect(jsonPath("$[2].name", is("Cersei")));
//	}
//*/
}
