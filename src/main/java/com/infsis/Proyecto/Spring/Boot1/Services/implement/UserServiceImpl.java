package com.infsis.Proyecto.Spring.Boot1.Services.implement;

import com.infsis.Proyecto.Spring.Boot1.DTOs.UserDTO;
import com.infsis.Proyecto.Spring.Boot1.Models.Userc;
import com.infsis.Proyecto.Spring.Boot1.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Optional<UserDTO> getUserById(Integer userId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Integer userId) {
    }

    private UserDTO UsertoDto(Userc user){
        UserDTO userDTO=new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }
    
    private Userc DtoToUser(UserDTO userDTO) {
        Userc user = new Userc();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return user;
    }
}
