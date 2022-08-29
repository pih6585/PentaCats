package com.pentacats.animal.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pentacats.animal.board.dao.BoardDaoMapper;
import com.pentacats.animal.board.repository.BoardRepository;

@Service
public class BoardService {

	private final BoardRepository boardRepository;

	private final BoardDaoMapper boardDaoMapper;

	@Autowired
	public BoardService(BoardRepository boardRepository, @Qualifier("boardDaoMapper") BoardDaoMapper boardDaoMapper) {
		this.boardRepository = boardRepository;
		this.boardDaoMapper = boardDaoMapper;
	}
}
