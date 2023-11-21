package com.gdsc.pagingtest;

import com.gdsc.pagingtest.dto.TestData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PagingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagingTestApplication.class, args);
    }

    @Bean
    public TestData testDataInit(PostRepository postRepository) {
        return new TestData(postRepository);
    }
}
