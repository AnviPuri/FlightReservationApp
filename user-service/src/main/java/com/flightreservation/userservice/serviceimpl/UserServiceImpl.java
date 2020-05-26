package com.flightreservation.userservice.serviceimpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.flightreservation.userservice.dtos.UserDTO;
import com.flightreservation.userservice.enity.User;
import com.flightreservation.userservice.repo.UserRepository;
import com.flightreservation.userservice.service.UserService;
import com.flightreservation.userservice.utility.Utility;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private ModelMapper modelMapper;

	private User user;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public UserDTO createUser(UserDTO userDTO) {

		user = modelMapper.map(userDTO, User.class);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user = userRepo.save(user);
		userDTO = modelMapper.map(user, UserDTO.class);
		return userDTO;
	}

	@Override
	public UserDTO updateUser(UserDTO userDTO, int id) {

		user = modelMapper.map(userDTO, User.class);
		Optional<User> presentUser = userRepo.findById(id);
		user.setAudit(presentUser.get().getAudit());
		User updatedUser = userRepo.save(user);
		userDTO = modelMapper.map(updatedUser, UserDTO.class);
		return userDTO;
	}

	@Override
	public void softDeleteUser(int id) {

		Optional<User> presentUser = userRepo.findById(id);
		user = presentUser.get();
		user.setDeletedAt(Utility.getEpochTime());
		userRepo.save(user);
	}

}
