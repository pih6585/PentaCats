package com.pentacats.animal.board.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "reply")
public class ReplyEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Id
	@Column(nullable = false)
	private int boardId;

	@Column(length = 30, nullable = false)
	private String email;

	@Column(length = 50)
	private String contents;

	@Column(length = 20)
	private String nickName;

	private LocalDateTime createdDate;

	private LocalDateTime lastEditDate;

	private int level;

	@Id
	private int parentId;

}
