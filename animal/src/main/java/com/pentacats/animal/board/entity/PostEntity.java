package com.pentacats.animal.board.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "post")
public class PostEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int boardId;

	private String email;

	private String title;

	private String contents;

	private String nickName;

	private LocalDateTime createdDate;

	private LocalDateTime deleteDate;

	private LocalDateTime lastEditDate;

	private String commentYn;

	private String imageUrl;


}
