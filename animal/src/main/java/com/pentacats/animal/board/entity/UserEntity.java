package com.pentacats.animal.board.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pentacats.animal.contants.Role;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserEntity implements Serializable {

	@Id
	private String email;

	private String name;

	private String nickName;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Role role;

	private String description;

	private int visitCount;


}
