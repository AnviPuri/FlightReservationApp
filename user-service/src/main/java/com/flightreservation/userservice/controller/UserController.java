package com.flightreservation.userservice.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightreservation.userservice.dtos.UserDTO;
import com.flightreservation.userservice.requestmodel.UserRequestModel;
import com.flightreservation.userservice.responsemodel.UserResponseModel;
import com.flightreservation.userservice.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private ModelMapper modelMapper;

	private UserDTO userDTO;

	private UserResponseModel userResponseModel;

	@RequestMapping(value = "/create-user", method = RequestMethod.POST)
	public UserResponseModel createUser(@RequestBody UserRequestModel user) {

		userDTO = modelMapper.map(user, UserDTO.class);
		userDTO = userService.createUser(userDTO);
		userResponseModel = modelMapper.map(userDTO, UserResponseModel.class);
		return userResponseModel;

	}

	// Look into what is the best method to update
	@RequestMapping(value = "/update-user/{id}", method = RequestMethod.PATCH)
	public UserResponseModel updateUser(@RequestBody UserRequestModel user, @PathVariable("id") int id) {

		// Throw an exception for id not matching - To be done Later
//		if (user.getId() != id) {
//			
//		}
		// Throw an exception for no object present for that id - To be done Later

		userDTO = modelMapper.map(user, UserDTO.class);
		userDTO = userService.updateUser(userDTO, id);
		userResponseModel = modelMapper.map(userDTO, UserResponseModel.class);
		return userResponseModel;

	}

	@RequestMapping(value = "/soft-delete-user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> softDeleteUser(@PathVariable("id") int id) {

		// Throw an exception if no object present for the id - To be done Later
		
		//THrow an error if the object is already soft deleted - To be done Later

		userService.softDeleteUser(id);
		return ResponseEntity.ok().build();

	}

	// login

}
