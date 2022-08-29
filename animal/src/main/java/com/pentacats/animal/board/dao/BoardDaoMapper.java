package com.pentacats.animal.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.pentacats.animal.board.entity.BoardEntity;

@Mapper
@Repository("boardDaoMapper")
public interface BoardDaoMapper {

	BoardEntity findById(BoardEntity boardEntity);

	List<BoardEntity> findByAll(BoardEntity boardEntity);

}
