package com.example.social.media.DTO;

import com.example.social.media.Model.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DTOMapper implements Function<User,UserDTO> {

    @Override
    public UserDTO apply(User user) {
        return new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                user.getGender(),
                user.getRole(),
                user.getPosts()
        );
    }
}
