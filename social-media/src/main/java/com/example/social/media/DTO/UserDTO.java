package com.example.social.media.DTO;

import com.example.social.media.Model.Post;
import com.example.social.media.Model.Genders;
import com.example.social.media.Model.Roles;

import java.util.List;

public record UserDTO(
        Integer id,
        String firstName,
        String lastName,
        Integer age,
        Genders gender,
        Roles role,
        List<Post> posts
        ) {
}
