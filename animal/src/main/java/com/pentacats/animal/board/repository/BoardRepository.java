package com.pentacats.animal.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pentacats.animal.board.entity.BoardEntity;
import com.pentacats.animal.board.entity.UserEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
