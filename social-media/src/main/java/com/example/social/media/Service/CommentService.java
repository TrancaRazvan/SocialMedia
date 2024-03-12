package com.example.social.media.Service;

import com.example.social.media.Repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    @Autowired
    private final CommentRepository commentRepository;
}
