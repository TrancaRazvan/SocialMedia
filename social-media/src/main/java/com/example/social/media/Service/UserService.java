package com.example.social.media.Service;

import com.example.social.media.Model.User;
import com.example.social.media.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final static String USERNAME_NOT_FOUND
            = "Username not found.";
    private final static String USER_EMAIL_NOT_FOUND
            = "User with email %s not found.";
    @Autowired
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException
                        (String.format(USER_EMAIL_NOT_FOUND, email)));
    }

}
