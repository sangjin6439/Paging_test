package com.gdsc.pagingtest;

import com.gdsc.pagingtest.dto.PostResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Page<PostResponseDto> paging(Pageable pageable) {

        int page = pageable.getPageNumber() - 1; // page 위치에 있는 값을 0부터 시작함
        int pageLimit = 10; //한 페이지에 보여지는 글 개수

        //한 페이지당 2개의 글을 보여주고 정렬 기준을 ID기준으로 오름차순으로 보여줌
        Page<Post> postPages = postRepository.findAll(PageRequest.of(page, pageLimit, Sort.by(Sort.Direction.ASC, "id")));

         //목록 : id, title, content, author
        Page<PostResponseDto> postResponseDtos = postPages.map(
                postPage -> new PostResponseDto(postPage));


        return postResponseDtos;
    }


}
