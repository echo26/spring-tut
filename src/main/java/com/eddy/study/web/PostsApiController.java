package com.eddy.study.web;

import com.eddy.study.service.posts.PostsService;
import com.eddy.study.web.dto.PostsResponseDto;
import com.eddy.study.web.dto.PostsSaveRequestDto;
import com.eddy.study.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto update(@PathVariable Long id){
        return postsService.findById(id);
    }
}
