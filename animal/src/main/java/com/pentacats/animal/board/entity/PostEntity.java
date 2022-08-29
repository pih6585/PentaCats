package com.pentacats.animal.board.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Entity
@Data
@Table(name = "post")
public class PostEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private int boardId;

	@Column(length = 30, nullable = false)
	private String email;

	@Column(length = 50)
	private String title;

	@Lob
	private String contents;

	@Column(length = 20)
	private String nickName;

	private LocalDateTime createdDate;

	private LocalDateTime deleteDate;

	private LocalDateTime lastEditDate;

	@Column(length = 10)
	@ColumnDefault("'Y'")
	private String commentYn;

	@Lob
	private String imageUrl;


}
