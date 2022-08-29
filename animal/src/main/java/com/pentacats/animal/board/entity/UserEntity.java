package com.pentacats.animal.board.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.pentacats.animal.contants.Role;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserEntity implements Serializable {

	@Id
	@Column(length = 30)
	private String email;

	@Column(length = 20, nullable = false)
	private String name;

	@Column(length = 20, nullable = false)
	private String nickName;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 20)
	private Role role;

    @Lob
	private String description;

    @ColumnDefault("0")
	private int visitCount;


}
