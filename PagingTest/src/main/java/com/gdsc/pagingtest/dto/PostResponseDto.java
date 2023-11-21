package com.gdsc.pagingtest.dto;

import com.gdsc.pagingtest.Post;
import lombok.Data;

@Data
public class PostResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostResponseDto(Post post){
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.author = post.getAuthor();
    }

}
