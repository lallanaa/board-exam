package com.exam.board.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boardId")
    @SequenceGenerator(name = "boardId", sequenceName = "boardId", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private String content;
    private Long userId;
    private LocalDateTime regTime;

}
