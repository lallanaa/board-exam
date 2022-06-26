package com.exam.board.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BoardDtoTest {

    @Test
    void lombok() {
        String title = "게시글1";
        BoardDto boardDto = BoardDto.builder()
                .title(title)
                .content("게시글입니다.")
                .userId(1L)
                .regTime(LocalDateTime.now())
                .build();

        assertThat(boardDto.getTitle()).isEqualTo(title);
    }

}