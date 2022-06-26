package com.exam.board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class BoardDto {

    private String title;
    private String content;
    private Long userId;
    private LocalDateTime regTime;

}
