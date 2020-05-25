package com.flightreservation.userservice.serviceimpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservation.userservice.dtos.UserDTO;
import com.flightreservation.userservice.enity.User;
import com.flightreservation.userservice.repo.UserRepository;
import com.flightreservation.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private ModelMapper modelMapper;

	private User user;

	private User updatedUser;

	@Override
	public UserDTO createUser(UserDTO userDTO) {

		user = modelMapper.map(userDTO, User.class);
		user = userRepo.save(user);
		userDTO = modelMapper.map(user, UserDTO.class);
		return userDTO;
	}

	@Override
	public UserDTO updateUser(UserDTO userDTO, int id) {

		user = modelMapper.map(userDTO, User.class);
		if (userDTO.getId() != id) {
			// Return an exception for id not matching -Exception Handling to be done later
		}
		Optional<User> presentUser = userRepo.findById(id);
		if (!presentUser.isPresent()) {
			// return an exception for no object present for that id - Exception Handling to
			// be done later
		}
		user.setAudit(presentUser.get().getAudit());
		updatedUser = userRepo.save(user);
		userDTO = modelMapper.map(updatedUser, UserDTO.class);
		return userDTO;
	}

}
