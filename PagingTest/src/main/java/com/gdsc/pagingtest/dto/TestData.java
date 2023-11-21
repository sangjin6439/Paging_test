package com.gdsc.pagingtest.dto;

import com.gdsc.pagingtest.Post;
import com.gdsc.pagingtest.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@RequiredArgsConstructor
public class TestData {

    private final PostRepository postRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void initData() {
        postRepository.save(Post.builder()
                .title("잭과 콩나무")
                .content("콩나물 먹고 싶다.")
                .author("인상진")
                .build());

        postRepository.save(Post.builder()
                .title("셜록 홈즈")
                .content("멋지다")
                .author("인")
                .build());

        postRepository.save(Post.builder()
                .title("우솝이화")
                .content("여우가 귀엽다")
                .author("상")
                .build());

        postRepository.save(Post.builder()
                .title("토끼와 거북이")
                .content("토끼 진짜 빠르다.")
                .author("진")
                .build());

        for (int i = 0; i < 100; i++) {
            postRepository.save(Post.builder()
                    .title("테스트용" + i)
                    .content("hi")
                    .author("홍길동"+i)
                    .build());
        }
    }


}
