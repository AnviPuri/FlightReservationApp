package com.flightreservation.userservice.service;

import com.flightreservation.userservice.dtos.UserDTO;

public interface UserService {

	public UserDTO createUser(UserDTO userDTO);

	public UserDTO updateUser(UserDTO userDTO, int id);

	public void softDeleteUser(int id);

}
