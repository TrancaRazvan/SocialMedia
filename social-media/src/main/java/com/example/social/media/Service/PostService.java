package com.example.social.media.Service;

import com.example.social.media.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    @Autowired
    private final PostRepository postRepository;
}
