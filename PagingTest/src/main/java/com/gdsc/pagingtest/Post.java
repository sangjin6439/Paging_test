package com.gdsc.pagingtest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column(length = 1500)
    private String content;

    @Column String author;

    @Builder
    public Post(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

}
