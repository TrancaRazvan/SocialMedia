package com.example.social.media.DTO;

import com.example.social.media.Model.Post;
import com.example.social.media.Model.UserGender;
import com.example.social.media.Model.UserRole;

import java.util.List;

public record UserDTO(
        Integer id,
        String firstName,
        String lastName,
        Integer age,
        UserGender gender,
        UserRole role,
        List<Post> posts
        ) {
}
